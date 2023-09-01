package com.fashionkings.core.service;

import java.util.List;

import com.fashionkings.core.jpa.Category;

public interface CategoryService {
	List<Category> allCategories();
	Category getById(long id);
	Category update(Category category);
	Category add(Category category);
	//Category delete(Category category);
	void delete(long id);
	void saveCover(long id, String filename);
	
}	