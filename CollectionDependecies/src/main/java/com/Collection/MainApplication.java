package com.Collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		Student s = (Student)context.getBean("student");
		s.showName();
	}

}
