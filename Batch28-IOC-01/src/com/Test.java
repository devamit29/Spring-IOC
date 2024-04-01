package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	
	public static void main(String[] args) {
//		Student s=new Student();
		
		//beanFactory(Interface) >> applicationContext(Interface)
		
		Resource resource=new ClassPathResource("NewFile.xml");
		BeanFactory bean=new XmlBeanFactory(resource);
		
		Student s=(Student)bean.getBean("s");//lazy loading
		s.m1();
		
		College c=(College)bean.getBean("c");
		c.m2();
	}

}
