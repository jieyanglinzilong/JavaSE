package wrh_homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class wrh_XmlBeanAssembleTest {
	public static void main (String [] args) {
		//定义配置文件路径
		String xmlPath="wrh_homework/wrh_beans.xml";
		//加载配置文件
		ApplicationContext applicatContext=new ClassPathXmlApplicationContext(xmlPath);
		//构造方式输出结果
		System.out.println(applicatContext.getBean("student1"));
		//设置方式输出结果
		System.out.println(applicatContext.getBean("student2"));
		System.out.println("学号：2018266127");
		System.out.println("班级：20181121");
		System.out.println("姓名：吴瑞鹤");
	}
}
