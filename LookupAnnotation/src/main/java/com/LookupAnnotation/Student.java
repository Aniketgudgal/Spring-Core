package com.LookupAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component("student")
public class Student {
	@Autowired
	Person person;
	public Student() {
		super();
		System.out.println("Student class Constructor");
	}
	@Lookup
	public Person display()
	{
		return null;
	}
}
