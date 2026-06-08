package com.LifeCycle.Annotation;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component("emp")
public class Employee {
	
	public Employee() {
		super();
		System.out.println("Constructor Initialization");
	}
	@PostConstruct
	public void initialMethod()
	{
		System.out.println("Initial Method of Bean");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("Destroy Method of Bean");
	}
}
