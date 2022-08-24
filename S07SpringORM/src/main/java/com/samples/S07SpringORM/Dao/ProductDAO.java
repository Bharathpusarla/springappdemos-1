package com.samples.S07SpringORM.Dao;

import com.samples.S07SpringORM.entity.Product;

public interface ProductDAO {

	int create(Product product);
	
	void update(Product product);
	
	void delete(Product product);
	
}
