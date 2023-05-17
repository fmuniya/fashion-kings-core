package com.fashionkings.core.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fashionkings.core.dto.ProductDTO;
import com.fashionkings.core.service.CategoryService;
import com.fashionkings.core.service.ProductService;
//import com.fashionkings.core.service.ProductService;
import com.fashionkings.core.util.MenuMap;

@Controller
@RequestMapping("products")
public class ProductController {
	
	private CategoryService categoryService;
	private ProductService productService;
	
		
	  public ProductController(CategoryService categoryService, ProductService productService) {
		super();
		this.categoryService = categoryService;
		this.productService = productService;
	}
	 
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String allProducts(Model model) {
		System.out.println("The Product controller ran......");
		//get products from d/b
		model.addAttribute("menu", buildMenu());
		model.addAttribute("products", productService.allProducts());
		System.out.println(productService.allProducts());
		return "product-lists";
	}
	
	private ProductDTO add(ProductDTO product){
		return productService.add(product);
	}
	
	@RequestMapping(value = "form", method = RequestMethod.GET)
	public String form(Model model) {
		model.addAttribute("menu", buildMenu());
		model.addAttribute("title", "Add a new product");
		model.addAttribute("product", new ProductDTO());
		model.addAttribute("categories", categoryService.allCategories());
		return "product-form";
	}
	
	
	
	
	@RequestMapping(value = "form", method = RequestMethod.POST)
	public String addProduct(Model model, @ModelAttribute ProductDTO product) {
		
			product = productService.add(product);
		
		model.addAttribute("menu", buildMenu());
		model.addAttribute("product", product);
		return "redirect:/products/"+product.getId();
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public String get(Model model, @PathVariable long id) {
		ProductDTO product = productService.get(id);
        model.addAttribute("title" , product.getTitle());
        model.addAttribute("product", product);
        model.addAttribute("menu", buildMenu());
        model.addAttribute("path", "/product/"+product.getId());
        model.addAttribute("image", product.getImage());
		return "product";
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
