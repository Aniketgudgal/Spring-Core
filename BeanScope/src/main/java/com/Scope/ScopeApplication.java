package com.Scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cont = new ClassPathXmlApplicationContext("Config.xml");
		Student s1 = (Student)cont.getBean("student");
		Student s2 = (Student)cont.getBean("student");
		Student s3 = (Student)cont.getBean("student");
		Employee e1 = (Employee)cont.getBean("emp");
		Employee e2 = (Employee)cont.getBean("emp");
		Employee e3 = (Employee)cont.getBean("emp");
	}

}
