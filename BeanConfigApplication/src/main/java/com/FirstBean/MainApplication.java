package com.FirstBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("FirstBean.xml");
		Student s1 = (Student)con.getBean("f");
		System.out.println("Id: "+s1.getId());
		System.out.println("Name: "+s1.getName());
		System.out.println("Roll No: "+s1.getRollNo());
	}

}
