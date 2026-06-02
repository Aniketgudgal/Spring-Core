package com.ObjectDepend;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Student {
	private Person person;
	private int marks;
	private int rollNo;
	public void displayInfo()
	{
		System.out.println(person.getId());
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(marks);
		System.out.println(rollNo);
	}
}
