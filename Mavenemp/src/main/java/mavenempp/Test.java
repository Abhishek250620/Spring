package mavenempp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("mavenempp/config.xml");
		Emp e1=(Emp)c1.getBean("abc");
		Emp e2=(Emp)c1.getBean("obj");
		System.out.println(e1);
		System.out.println(e2);
 	}
}
