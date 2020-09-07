package cn.itcast.Test;

import cn.itcast.dao.Employeesdao;
import cn.itcast.domin.Employees;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.annotation.Resource;
import java.io.InputStream;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;

public class TestMybatis {
    @Test
    public void run() throws Exception{
        InputStream inputStream= Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();
        Employeesdao employeesdao=session.getMapper(Employeesdao.class);
        List<Employees>employees=employeesdao.findAll();
        for(Employees employees1:employees){
            System.out.println(employees1);
        }
        session.close();
        inputStream.close();

    }
    @Test
    public void run2() throws Exception{
        InputStream inputStream= Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();
        Employeesdao employeesdao=session.getMapper(Employeesdao.class);
        Employees employees=new Employees();

        Calendar c = Calendar.getInstance();
         Date now1=new Date(new java.util.Date().getTime());
        Date now2=new Date(new java.util.Date().getTime());
        employees.setBirth_date(now1);
        employees.setHire_date(now2);
        employees.setEmp_no(1);
        employees.setGender("M");
        employees.setLast_name("Larke");
        employees.setFirst_name("Mondb");
        employeesdao.insert(employees);
        session.commit();
        session.close();
        inputStream.close();
        System.out.println("插入成功");

    }
}
