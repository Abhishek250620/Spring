package referencetype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("referencetype/config.xml");
		Employee e1=(Employee)c1.getBean("empobj");
		System.out.println(e1);
	}
}
