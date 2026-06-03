package com.AutoWireByName;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("Config.xml");
		Car c = (Car)con.getBean("car");
		c.display();
	}

}
