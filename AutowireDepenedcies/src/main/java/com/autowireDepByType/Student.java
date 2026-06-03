package com.autowireDepByType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
	private Person p;
	private int rollNo;
	public void display()
	{
		System.out.println("Id: "+p.getId());
		System.out.println("Name: "+p.getName());
		System.out.println("Age: "+p.getAge());
		System.out.println("Roll No: "+rollNo);
	}
}
