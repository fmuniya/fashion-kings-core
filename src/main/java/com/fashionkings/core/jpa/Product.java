package com.fashionkings.core.jpa;

public class Product {
	
	private long id;
	
	
	private String title;
	
	
	public long getId() {
		return id;
	}
	
	public Product setId(long id) {
		this.id = id;
		return this;
	}
				
	public String getTitle() {
		return title;
	}
	
	
	public Product setTitle(String title) {
		this.title = title;
		return this;
	}


	public String getDescription() {
		return description;
	}


	public Product setDescription(String description) {
		this.description = description;
		return this;
	}
	
	private String description;


	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", description=" + description + "]";
	}

	/*
	 * @Override public String toString() { 
	 * return "Product [id=" + id + ", title=" + title + ", description=" + description + "]"; }
	 */
	
	
	
	

}
