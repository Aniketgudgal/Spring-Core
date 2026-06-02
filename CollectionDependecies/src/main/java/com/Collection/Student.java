package com.Collection;

import java.util.List;

public class Student {
	private List<String> name;
	public void setName(List<String> name)
	{
		this.name = name;
	}
	public void showName()
	{
		for(String s: name)
		{
			System.out.println(s);
		}
	}
}
