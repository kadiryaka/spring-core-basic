package com.kadiryaka.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		RentalService bean = context.getBean("rentialService2", RentalService.class);
		System.out.println(bean.getName());		
	}

}
