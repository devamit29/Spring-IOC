package dom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext apc=new ClassPathXmlApplicationContext("NewFile1.xml");
		
		Employee e=apc.getBean("emp", Employee.class);
		System.out.println(e);
	}

}
