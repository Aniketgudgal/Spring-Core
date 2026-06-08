package com.LookupAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationLook {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Student s1 = (Student)context.getBean("student");
		Student s2 = (Student)context.getBean("student");
		Student s3 = (Student)context.getBean("student");
		Student s4 = (Student)context.getBean("student");
		s1.display();
		s2.display();
		s3.display();
		s4.display();
	}

}
