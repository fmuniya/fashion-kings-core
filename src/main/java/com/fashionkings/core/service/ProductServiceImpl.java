package com.fashionkings.core.service;

import org.springframework.stereotype.Service;

import com.fashionkings.core.jpa.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public Product[] allProducts() {
		Product prod1 = new Product()
				.setId(1)
				.setTitle("Jackets")
				.setDescription("Jackets");
				
		Product prod2 = new Product()
					.setId(1)
					.setTitle("Shoes")
					.setDescription("Shoes and Sneakers");
				
		Product prod3 = new Product()
						.setId(1)
						.setTitle("Hats")
						.setDescription("Hats");
				
		Product[] products = {prod1, prod2, prod3};
				
				return products;
	}

}
