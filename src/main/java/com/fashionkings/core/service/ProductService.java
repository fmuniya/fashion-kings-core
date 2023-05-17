package com.fashionkings.core.service;

import java.util.List;

import com.fashionkings.core.dto.ProductDTO;
import com.fashionkings.core.jpa.Product;

public interface ProductService {
	List<Product> allProducts();
	ProductDTO add(ProductDTO product);
	ProductDTO get(long id);

}
