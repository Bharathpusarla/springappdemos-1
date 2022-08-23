package com.samples.S07SpringORM;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.S07SpringORM.Dao.ProductDAO;
import com.samples.S07SpringORM.entity.Product;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/S07SpringORM/SpringConfig.xml");

		ProductDAO productDAO = (ProductDAO) springContainer.getBean("productdao");
		
		Product product = new Product();
		product.setId(1);
		product.setName("Furniture");
		product.setDescription("rose wood");
		product.setPrice(10000);
		
		productDAO.create(product);
	}
}
