package com.samples.S01springcoredi.propertyfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/samples/S01springcoredi/propertyfile/SpringConfig.xml");
		MyDAO dao = (MyDAO) context.getBean("dao");
		System.out.println(dao);
		
	}

}
