package com.base.email.service;

public interface IMailService {

    /**
     *  邮件发送
     * @param subject 主题
     * @param content 内容
     * @param to 收件人
     */
    void sendEmail(String subject,String content,String...to) throws Exception;
}
