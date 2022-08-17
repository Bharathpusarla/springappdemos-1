package com.samples.S01springcoredi.scopes;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		// create the spring container
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/S01springcoredi/scopes/SpringConfig.xml");

		Employee emp1 = (Employee) springContainer.getBean("emp");
		System.out.println(emp1.hashCode());
		
		Employee emp2 = (Employee) springContainer.getBean("emp");
		System.out.println(emp2.hashCode());
	}
}
