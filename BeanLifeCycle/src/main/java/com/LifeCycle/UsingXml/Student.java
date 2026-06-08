package com.LifeCycle.UsingXml;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Student {
	public Student() {
		System.out.println("Constructor Initilization");
	}
	private int id;
	private String name;
	public void initialMethod()
	{
		System.out.println("Initial Method Initilization");
	}
	public void destroyMethod()
	{
		System.out.println("Bean Destroy");
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
