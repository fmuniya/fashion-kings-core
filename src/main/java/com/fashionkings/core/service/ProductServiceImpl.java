package com.fashionkings.core.service;
import java.util.Collection;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.fashionkings.core.dto.ProductDTO;
import com.fashionkings.core.jpa.Category;
import com.fashionkings.core.jpa.Product;
import com.fashionkings.core.repository.CategoryRepository;
import com.fashionkings.core.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired	
	private ProductRepository productRepo;
	
	@Autowired
	private CategoryRepository catRepository;
	
	@Override
	public Collection<Product> getProducts() {
		
		return productRepo.findAll();
	}
	
	
	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepo = productRepository;
	}

	
	  @Override
	  public ProductDTO get(long id) {
		  Product product = productRepo.findById(id).get();
		  ProductDTO dto = new ProductDTO();
		  BeanUtils.copyProperties(product, dto);
		  return dto;
			  }
	  
	  @Override 
	  public ProductDTO add(ProductDTO productDTO) {
		  Product product = new Product();
		  BeanUtils.copyProperties(productDTO, product);
		  for(long id: productDTO.getCategoryIds()) {
			  Optional<Category> optional = catRepository.findById(id);
			  if (optional.isPresent()) {
				  product.addCategory(optional.get());
			  }
		  }
		  product = productRepo.save(product);
		  productDTO.setId(product.getId());
		  
		  return productDTO;
	  }
	  
	  @Override
	  public ProductDTO update(ProductDTO product) {
		  Optional<Product> optional = productRepo.findById(product.getId());
		  if(optional.isEmpty()) {
			  throw new RuntimeException("NOT FOUND");
		  }
		  
		  Product prod = optional.get().setTitle(product.getTitle())
				  					.setPrice(product.getPrice())
				  					.setDescription(product.getDescription())
				  					.setDiscountPercent(product.getDiscountPercent())
				  					.setStockQuantity(product.getStockQuantity());
		  return null ;
	  }
	 


	@Override
	public List<Product> allProducts() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	/*
	 * @Override public ProductDTO add(ProductDTO productDTO) { // TODO
	 * Auto-generated method stub Product product = new Product();
	 * BeanUtils.copyProperties(productDTO, product, "categories", "id"); for(long
	 * id: productDTO.getCategoryIds()) { Optional<Category> optional =
	 * catRepository.findById(id); if(optional.isPresent()) {
	 * product.addCategory(optional.get()); } } product = productRepo.save(product);
	 * productDTO.setId(product.getId()); return productDTO;
	 * 
	 * }
	 * 
	 * @Override public ProductDTO get(long id) { Product product =
	 * productRepo.findById(id).get(); ProductDTO dto = new ProductDTO();
	 * BeanUtils.copyProperties(product, dto); List<Long> catIds =
	 * product.getCategories() .stream() .map(Category::getId)
	 * .collect(Collectors.toList()); dto.setCategoryIds(catIds); return dto; }
	 * 
	 * 
	 * @Override public void saveImage(long id, String filename) { Product product =
	 * productRepo.findById(id).orElseThrow(); product.setImage(filename);
	 * productRepo.save(product);
	 * 
	 * }
	 * 
	 * 
	 * @Override public Page<Product> browse(int pageNumber) { // TODO
	 * Auto-generated method stub return null; }
	 */


}
