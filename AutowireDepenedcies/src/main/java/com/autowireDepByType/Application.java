package com.autowireDepByType;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cont = new ClassPathXmlApplicationContext("Config.xml");
		Student s = (Student) cont.getBean("student");
		s.display();
	}
}
