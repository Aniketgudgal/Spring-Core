package com.AnnotationBean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component("emp")
@Getter
@Setter
public class Employee {
	@Value("1")
	private int id;
	@Value("Aniket")
	private String name;
	@Value("1000")
	private int salary;
	
	public void display()
	{
		System.out.println("Id of Employee: "+id);
		System.out.println("Name of Employee: "+name);
		System.out.println("Salary of Employee: "+salary);
	}
}
