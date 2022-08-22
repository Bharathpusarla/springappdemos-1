package com.samples.S05InterfaceInjection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.S05InterfaceInjection.DAO.OrderDAO;
import com.samples.S05InterfaceInjection.DAO.impl.OrderDAOImpl;
import com.samples.S05InterfaceInjection.service.OrderService;

/**
 * Hello world!
 *
 */
public class App {
	private static final String List = null;

	public static void main(String[] args) {
		// create the spring container
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/S05InterfaceInjection/SpringConfig.xml");

		OrderService service = (OrderService) springContainer.getBean("orderservice");
		System.out.println(service);
		service.placeOrder();
		
		
		

	}
}
