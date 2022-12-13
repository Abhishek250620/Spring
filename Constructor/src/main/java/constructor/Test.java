package constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("constructor/config.xml");
		Student s=(Student)c1.getBean("obj");
		System.out.println(s);
		System.out.println(s.getSubject().getClass());
	}
}
