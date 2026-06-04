package com.AnnotationBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.AnnotationBean.Configuration.BeanConfig;

public class RunApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(BeanConfig.class);
		
		Employee e = (Employee) con.getBean("emp");
		e.display();
	}

}
