package com.fashionkings.core.service;

import org.springframework.stereotype.Service;

import com.fashionkings.core.jpa.Category;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Override
	public Category[] allCategories() {
		Category cat1 = new Category()
		.setId(1)
		.setTitle("Men")
		.setDescription("Mens wear category");
		
		Category cat2 = new Category()
			.setId(1)
			.setTitle("Women")
			.setDescription("Womens wear category");
		
		Category cat3 = new Category()
				.setId(1)
				.setTitle("kids")
				.setDescription("Kids wear category");
		
		Category[] categories = {cat1, cat2, cat3};
		
		return categories;
		
	}

}
