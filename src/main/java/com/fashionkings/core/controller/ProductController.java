package com.fashionkings.core.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.fashionkings.core.dto.ProductDTO;
import com.fashionkings.core.service.CategoryService;
import com.fashionkings.core.service.ProductService;
//import com.fashionkings.core.service.ProductService;
import com.fashionkings.core.util.MenuMap;

@Controller
@RequestMapping("product")
public class ProductController {
	
	private CategoryService categoryService;
	private ProductService productService;
	
		
	  public ProductController(CategoryService categoryService, ProductService productService) {
		super();
		this.categoryService = categoryService;
		this.productService = productService;
	}
	  
	  
		@RequestMapping(value = "{id}", method = RequestMethod.GET)
		public String get(Model model, @PathVariable long id) {
			ProductDTO product = productService.get(id);
	        model.addAttribute("title" , product.getTitle());
	        model.addAttribute("product", product);
	        model.addAttribute("menu", buildMenu());
	        model.addAttribute("path", "/product/"+product.getId());
	        //model.addAttribute("image", product.getImage());
			return "product";
		}
	 
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String allProducts(Model model) {
		//System.out.println("The Product controller ran......");
		//get products from d/b
		model.addAttribute("menu", buildMenu());
		model.addAttribute("products", productService.allProducts());
		//System.out.println(productService.allProducts());
		return "product-list";
	}
	
	@RequestMapping(value = "form", method = RequestMethod.GET)
	public String form(Model model) {
		model.addAttribute("menu", buildMenu());
		model.addAttribute("title", "Add a new product");
		model.addAttribute("product", new ProductDTO());
		model.addAttribute("categories", categoryService.allCategories());
		System.out.println("ran simple form not edit");
		return "product-form";
	}
	

	// EDIT FUNCTIONALITY
	 // @GetMapping("form/{id}") 
	  @RequestMapping(value = "form/{id}", method = RequestMethod.GET)
	  public String edit(Model model, @PathVariable long id) {
		  ProductDTO product = productService.get(id);
		  System.out.println(product);
		  model
		  	.addAttribute("menu", buildMenu())
		  	.addAttribute("title", "Edit product")
		  	.addAttribute("product", product)
		  	.addAttribute("categories", categoryService.allCategories());
		  return "product-form";
	  
	  }
	
	@RequestMapping(value = "form", method = RequestMethod.POST)
	public String addOrUpdate(Model model, @ModelAttribute ProductDTO product) {
		
		System.out.println(product);
		if(product.getId() > 0) {
			product = update(product);
		} else {
			product = add(product);
		}
		model.addAttribute("menu", buildMenu());
		model.addAttribute("product", product);
		return String.format("redirect:/product/%s", product.getId());
		//return "redirect:/product/"+product.getId();
	}
	
	private MenuMap buildMenu()
	{
		MenuMap menuMap = new MenuMap();
		menuMap.setTitle("Products")
			.addPair("List Products", "/product/list")
			.addPair("New Products", "/product/form");
				
		return menuMap;
	}
	
	private ProductDTO add(ProductDTO product) {
		return productService.add(product);
	}
	
	private ProductDTO update(ProductDTO product) {
		return productService.update(product);
	}
}
