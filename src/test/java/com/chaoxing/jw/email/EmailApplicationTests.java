package com.chaoxing.jw.email;
import com.chaoxing.jw.email.service.MailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmailApplicationTests {


    @Autowired
    private MailService mailService;

    @Test
    void contextLoads() {
    }


    @Test
    public void test2() {

        mailService.sendAttachmentsMail();


    }


}
