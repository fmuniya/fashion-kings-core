package com.fashionkings.core.service;

import java.util.Collection;
import java.util.List;

import com.fashionkings.core.dto.ProductDTO;

//import org.springframework.data.domain.Page;

//import com.fashionkings.core.dto.ProductDTO;
import com.fashionkings.core.jpa.Product;


public interface ProductService {
	
	Collection<Product> getProducts();
	ProductDTO get (long id);
	ProductDTO add(ProductDTO product);
	ProductDTO update(ProductDTO product);
	List<Product> allProducts();
	
	

}
