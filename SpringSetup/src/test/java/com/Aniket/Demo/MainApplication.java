package com.Aniket.Demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cont  = new ClassPathXmlApplicationContext("Test.xml");
		Object obj = cont.getBean("abc");
		Student s = (Student)obj;
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getSalary());
	}

}
