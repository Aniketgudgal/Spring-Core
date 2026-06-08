package com.LifeCycle.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleAnnotationApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationAnnotation.class);
		Employee e = (Employee)context.getBean("emp");
		context.registerShutdownHook();
	}

}
