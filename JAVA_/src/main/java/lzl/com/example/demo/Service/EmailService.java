package lzl.com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender mailSender;
    @Value("1679569188@qq.com")
    private String from;
    public void sendSimpleEmail(String to,String subject,String text){
        SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
        simpleMailMessage.setFrom(from);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setCc(from);
        simpleMailMessage.setText(text);
        simpleMailMessage.setTo(to);
       try{
           mailSender.send(simpleMailMessage);
       }catch (Exception e){
           e.printStackTrace();
       }

    }

}
