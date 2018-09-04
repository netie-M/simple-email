package com.base.email;

import com.base.email.service.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EmailApplication.class, args);
    }


    @Autowired
    IMailService mailService;
    @Override
    public void run(String... args) throws Exception {
//        mailService.sendEmail("自定义邮件","测试邮件", "shyanyanmao@quarkfinance.com");
    }
}
