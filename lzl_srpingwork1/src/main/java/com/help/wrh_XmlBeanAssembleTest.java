package wrh_homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class wrh_XmlBeanAssembleTest {
	public static void main (String [] args) {
		//���������ļ�·��
		String xmlPath="wrh_homework/wrh_beans.xml";
		//���������ļ�
		ApplicationContext applicatContext=new ClassPathXmlApplicationContext(xmlPath);
		//���췽ʽ������
		System.out.println(applicatContext.getBean("student1"));
		//���÷�ʽ������
		System.out.println(applicatContext.getBean("student2"));
		System.out.println("ѧ�ţ�2018266127");
		System.out.println("�༶��20181121");
		System.out.println("�����������");
	}
}
