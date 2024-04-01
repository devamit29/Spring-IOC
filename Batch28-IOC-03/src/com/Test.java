package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext apc=new ClassPathXmlApplicationContext("NewFile.xml");
		
	    System.out.println("--------------------------------------");
		Student s=apc.getBean("s",Student.class);
		System.out.println("Student : "+s.hashCode());
		System.out.println("Book : "+s.getBook().hashCode());
		
		
		System.out.println("**************************************");
		Student s1=apc.getBean("s",Student.class);
		System.out.println("Student : "+s1.hashCode());
		System.out.println("Book : "+s1.getBook().hashCode());
	}

}
