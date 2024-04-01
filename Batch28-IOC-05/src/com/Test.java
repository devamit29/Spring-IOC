package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext apc=new AnnotationConfigApplicationContext(AppConfig.class);
		
//		Student s=apc.getBean("s",Student.class);
//		System.out.println(s.hashCode());
//		
//		Student s1=apc.getBean("s",Student.class);
//		System.out.println(s1.hashCode());
//		
		College c=apc.getBean("c",College.class);
		System.out.println(c);
	}
	

}
