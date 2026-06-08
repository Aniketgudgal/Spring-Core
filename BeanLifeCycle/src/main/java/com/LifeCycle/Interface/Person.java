package com.LifeCycle.Interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("p")
@Lazy
public class Person implements InitializingBean, DisposableBean{
	public Person() {
		super();
		System.out.println("Initializing Constructor");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing init method");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy bean Method");
	}
}
