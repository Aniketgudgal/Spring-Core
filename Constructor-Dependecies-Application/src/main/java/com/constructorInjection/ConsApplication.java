package com.constructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cont = new ClassPathXmlApplicationContext("ConfigXML.xml");
		Student s = (Student)cont.getBean("con");
		System.out.println("Student id: "+s.getId()+"\tStudent Name: "+s.getName()+"\tRoll Number: "+s.getRollNo());
	}

}
