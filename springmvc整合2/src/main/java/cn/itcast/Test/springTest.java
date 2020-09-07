package cn.itcast.Test;

import cn.itcast.Services.EmployeesServices;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springTest {
    @Test
    public void test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application.xml") ;
        EmployeesServices as=(EmployeesServices)applicationContext.getBean("EmployeesService");
        as.findalll();


    }
}
