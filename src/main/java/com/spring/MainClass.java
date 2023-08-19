package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class MainClass {

	
	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		
		Student student = (Student) factory.getBean("Student");
		
		System.out.println(student.getName());
		
	}

}
