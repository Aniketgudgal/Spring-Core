package com.LifeCycle.UsingXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleBeanApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Configuration.xml");
		Student s = (Student) context.getBean("student");
		context.registerShutdownHook();
	}

}
