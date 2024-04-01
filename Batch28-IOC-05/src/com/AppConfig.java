package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration  //child annotation of @Component
public class AppConfig {
	
	@Bean(name="student")
	@Scope(value="prototype")
	public Student getStudentBean() {
		Student s=new Student();
		s.setSid(50);
		s.setSname("Amit");
		return s; 
	}
	
	@Bean(name="c")
	public College getCollegeBean() {
		College c=new College();
		
		c.setCid(101);
		c.setCname("Silicon");
//		c.setS(getStudentBean());
		return c;
		
	}
	@Bean(name="s1")
	@Scope(value="prototype")
	public Student getStudentBean2() {
		Student s=new Student();
		s.setSid(51);
		s.setSname("Akshya");
		return s; 
		
		
	}
	
	
	
	

}
