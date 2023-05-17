package com.fashionkings.core.dto;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fashionkings.core.jpa.Category;

public class ProductDTO {

		private long id;
		private String title;
		private String description;
		private int stockQuantity;
		private int discountPercent;
		private String image;
		private double price;
		private List<Long> categoryIds;
		private Set<Category> categories = new HashSet<>();
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
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public List<Long> getCategoryIds() {
			return categoryIds;
		}
		public void setCategoryIds(List<Long> categoryIds) {
			this.categoryIds = categoryIds;
		}
		public Set<Category> getCategories() {
			return categories;
		}
		public void setCategories(Set<Category> categories) {
			this.categories = categories;
		}


}
