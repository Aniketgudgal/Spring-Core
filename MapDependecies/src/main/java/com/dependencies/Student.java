package com.dependencies;

import java.util.Map;

public class Student {
	Map<Integer, String> data;
	public void setData(Map<Integer, String> data)
	{
		this.data = data;
	}
	public void display()
	{
		for(Map.Entry<Integer, String> mp: data.entrySet())
		{
			System.out.println(mp.getKey()+"\t"+mp.getValue());
		}
	}
}
