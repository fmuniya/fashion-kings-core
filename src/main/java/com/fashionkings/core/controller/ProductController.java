package com.fashionkings.core.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fashionkings.core.jpa.Product;
import com.fashionkings.core.service.ProductService;

@Controller
@RequestMapping("products")
public class ProductController {
	
	private ProductService productService;
	
	public ProductController (ProductService productService) {
		this.productService = productService;
	}
	
	@RequestMapping(value ="details")
	public String getDetails() {
		return "product-details";
	}
	
	@RequestMapping(value = "form", method = RequestMethod.GET)
	public String form() {
		System.err.println("=============== product details form GET WAS PEFORMED=================");
		
		return"product-form";
	}
	
	@RequestMapping(value = "form", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute Product product) {
		System.out.println("product output");
		System.err.println(product);
		
		return"product-form";
	}
	
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list(Model model) {
		
		System.out.println("the products controller ran");
		
		Product[] productList = productService.allProducts();
		model.addAttribute("products", productList);
		///get products from DBase
		return "product-lists";
	}
}
