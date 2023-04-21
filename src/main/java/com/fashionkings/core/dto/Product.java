package com.fashionkings.core.dto;


import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

public class Product {

	private long id;
	private String title;
	private String description;
	private int stockQuantity;
	private int discountPercent;
	private String price;
	private Long[] categories;
	
	
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	public int getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Long[] getCategories() {
		return categories;
	}
	public void setCategories(Long[] categories) {
		this.categories = categories;
	}
		
	

	

}
