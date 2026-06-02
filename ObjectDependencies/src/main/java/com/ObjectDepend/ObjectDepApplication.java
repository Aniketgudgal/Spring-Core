package com.ObjectDepend;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ObjectDepApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext conn = new ClassPathXmlApplicationContext("Config.xml");
		Student s = (Student) conn.getBean("student");
		s.displayInfo();
	}

}
