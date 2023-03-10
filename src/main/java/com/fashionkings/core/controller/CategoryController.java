package com.fashionkings.core.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fashionkings.core.jpa.Category;
import com.fashionkings.core.service.CategoryService;


@Controller
@RequestMapping("category")
public class CategoryController {
	
	private CategoryService categoryService;
	
	public CategoryController (CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	/*
	 * @Autowired public void setCategoryService(CategoryService categoryService) {
	 * this.categoryService = categoryService; }
	 */

	@RequestMapping(value ="details")
	public String getDetails() {
		return "category-details";
	}
	
	
	@RequestMapping(value = "form", method = RequestMethod.GET)
	public String form() {
		System.err.println("===============GET WAS PEFORMED=================");
		
		return"category-form";
	}
	
	@RequestMapping(value = "form", method = RequestMethod.POST)
	public String addCategory(@ModelAttribute Category category) {
		System.out.println("category output");
		System.err.println(category);
		
		
		return"category-form";
	}
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list(Model model) {
		
		Category[] categoryList = categoryService.allCategories();
		model.addAttribute("categories", categoryList);
				return "category-list";
	}

}
