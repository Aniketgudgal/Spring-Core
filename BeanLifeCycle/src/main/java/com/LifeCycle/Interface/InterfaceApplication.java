package com.LifeCycle.Interface;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InterfaceApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(InterfaceConfiguration.class);
		Person p = (Person)context.getBean("p");
		context.registerShutdownHook();
	}

}
