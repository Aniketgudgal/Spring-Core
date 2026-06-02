package com.dependencies;

import java.util.Map;

public class Employee {
	Map<Integer, String> name;
	public Employee(Map<Integer, String> name)
	{
		this.name = name;
	}
	public void display()
	{
		for(Map.Entry<Integer, String> n: name.entrySet())
		{
			System.out.println(n.getKey()+"\t"+n.getValue());
		}
	}
}
