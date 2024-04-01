package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext apc=new ClassPathXmlApplicationContext("NewFile.xml");
		Student s=(Student) apc.getBean("s");
		
		System.out.println(s);
		
		System.out.println("----------------------------\n");
		College c=apc.getBean("c",College.class);
		System.out.println(c);
	}

}
