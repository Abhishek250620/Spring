package collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("collection/NewFile.xml");
		ListEmp e1=(ListEmp)c1.getBean("obj");
		System.out.println(e1.getProjects().getClass());// getClass()-return implimentaion of class name with package name
	}
}
