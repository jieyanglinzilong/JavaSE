package lzl.com.example.demo;

import lzl.com.example.demo.Pojo.Usercenter;
import lzl.com.example.demo.dao.Infodao;
import lzl.com.example.demo.domain.info;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisTest2 {
    @Autowired
    private Infodao infodao;
    @Test
    public  void find(){
        Usercenter usercenters=infodao.find(1055);
        System.out.println(usercenters);
    }
    @Test
    public  void run(){
        List<info> infoList=infodao.findInfo();
        for(info info:infoList){
            System.out.println(info);
        }
    }
    @Test
    public  void add(){
       info info=new info();
       info.setEmail("123");
       info.setWord("123");
       info.setName("陈晨");
       info.setId(1230);
       infodao.addInformation(info);
    }
}
