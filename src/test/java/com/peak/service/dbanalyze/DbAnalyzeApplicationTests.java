package com.peak.service.dbanalyze;

import com.peak.service.dbanalyze.bean.MailBean;
import com.peak.service.dbanalyze.service.MailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DbAnalyzeApplicationTests {

    @Autowired
    MailService mailService;


    @Test
    void sendMail() {
        MailBean bean = new MailBean();
        bean.setRecipient("851189876@qq.com");
        bean.setSubject("spring boot send mail test");
        bean.setContent("<h1>Just a test</h1>");
        mailService.sendHtmlMail(bean);
    }
}
