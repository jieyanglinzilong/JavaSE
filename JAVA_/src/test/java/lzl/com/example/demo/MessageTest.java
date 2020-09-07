package lzl.com.example.demo;

import lzl.com.example.demo.Service.EmailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageTest {
    @Autowired
    private EmailService emailService;
    @Test
    public void send(){
        String to="1679569188@qq.com";
        String subject="文本标题";
        String text="内容测试";
        emailService.sendSimpleEmail(to,subject,text);

    }

}
