package com.dependencies;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cont = new ClassPathXmlApplicationContext("Configuration.xml");
		// using setter inject
		Student s = (Student) cont.getBean("student");
		s.display();
		
		System.out.println("Constructor Injection");
		// using constructor injection
		Employee e = (Employee) cont.getBean("emp");
		e.display();
	}

}
