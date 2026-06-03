package com.AutoWireByName;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Car {
	private Engine engine;
	private String color;
	public void display()
	{
		System.out.println("Id: "+engine.getId());
		System.out.println("Engine Name: "+engine.getName());
		System.out.println("Capacity: "+engine.getCapacity());
		System.out.println("Color: "+color);
	}
}
