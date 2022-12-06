 package collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("config.xml");
		Company c=(Company)c1.getBean("obj");
		System.out.println(c);
		System.out.println(c.getEmpcodeandname().getClass());
	}

}
