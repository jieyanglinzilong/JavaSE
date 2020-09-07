package com.mybatics;
import mybatics.cn.dom.Iuser;
import mybatics.cn.userdao.user;

import java.io.InputStream;
import java.util.List;

public class test {
    public static  void main(String args[]) throws  Exception{
        InputStream in=Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder =new  SqlSessionFactoryBuilder();
        SqlSessionFactory factory=builder.build(in);
        SqlSession session=factory.opneSession();
        Iuser userdao=session.getMapper(Iuser.class);
        List<user> users=userdao.findall();
        for(user usera:users){
            System.out.println(usera);

        }
        session.close();
        in.close();




    }
}
