package com.nowcoder.community;

import com.nowcoder.community.util.MailClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

/**
 * @description:
 * @author: JiangH
 * @time: 2023/11/1 21:47
 */
@SpringBootTest
public class MailTest {

    @Autowired
    private MailClient mailClient;

    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void testMailSend(){
        String to = "2360542085@qq.com";
        String subject = "Mail Test";
        String content =  "Welcome";
        mailClient.sendMail(to, subject,content);
    }


    @Test
    public void testHTMLMailSend(){
        Context context = new Context();
        context.setVariable("username", "帅哥");
        String content = templateEngine.process("/mail/demo", context);
        System.out.println(content);

        String to = "2360542085@qq.com";
        String subject = "Mail Test";
        mailClient.sendMail(to, subject,content);
    }
}
