package com.base.email.service.impl;

import com.base.email.service.IMailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Service
@Slf4j
public class MailServiceImpl implements IMailService {
    @Autowired
    private JavaMailSender javaMailSender;
    @Override
    public void sendEmail(String subject, String content, String... to) throws Exception {
        final MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        final MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
        Properties javaMailProperties = ((JavaMailSenderImpl) javaMailSender).getJavaMailProperties();
        message.setFrom(javaMailProperties.getProperty("mail.smtp.from"));
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);

        javaMailSender.send(mimeMessage);
    }
}
