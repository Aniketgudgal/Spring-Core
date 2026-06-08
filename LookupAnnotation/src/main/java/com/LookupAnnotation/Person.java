package com.LookupAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component("person")
@Scope("prototype")
@Getter
@Setter
public class Person {
	
	public Person() {
		super();
		System.out.println("Person class Constructor");
	}
}
