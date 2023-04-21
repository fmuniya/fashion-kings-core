package com.fashionkings.core.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fashionkings.core.dto.Product;
import com.fashionkings.core.service.CategoryService;
//import com.fashionkings.core.service.ProductService;
import com.fashionkings.core.util.MenuMap;

@Controller
@RequestMapping("products")
public class ProductController {
	
	private CategoryService categoryService;
	
	
	
	  public ProductController(CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}
	 
	  
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String allProducts(Model model) {
		System.out.println("The Product controller ran......");
		//get products from d/b
		model.addAttribute("menu", buildMenu());
		return "product-lists";
	}
	
	@RequestMapping(value = "form", method = RequestMethod.GET)
	public String form(Model model) {
		model.addAttribute("menu", buildMenu());
		model.addAttribute("title", "Add a new product");
		model.addAttribute("product", new Product());
		model.addAttribute("categories", categoryService.allCategories());
		return "product-form";
	}
	
	
	
	
	@RequestMapping(value = "form", method = RequestMethod.POST)
	public String addProduct(Model model, @ModelAttribute Product product) {
		com.fashionkings.core.jpa.Product jpaProduct = new com.fashionkings.core.jpa.Product();
		jpaProduct.setId(product.getId())
			.setTitle(product.getTitle())
			.setPrice(product.getPrice())
			.setDescription(product.getDescription())
			.setStockQuantity(product.getStockQuantity())
			.setDiscountPercent(product.getDiscountPercent());
		
		//model.addAttribute("menu", buildMenu());
		return "product-form";
	}
	
	@RequestMapping(value ="details")
	public String getDetails() {
		return "product-details";
	}
	
	private MenuMap buildMenu()
	{
		MenuMap menuMap = new MenuMap();
		menuMap.setTitle("Products")
			.addPair("List Products", "/products/list")
			.addPair("New Products", "/products/form");
				
		return menuMap;
	}
}
