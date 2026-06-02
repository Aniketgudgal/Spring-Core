package com.dependencies;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cont = new ClassPathXmlApplicationContext("Configuration.xml");
		Student s = (Student) cont.getBean("student");
		s.display();
	}

}
