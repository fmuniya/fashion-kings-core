package com.fashionkings.core.jpa;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name = "product_id")
	
	
	private long id;
	
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "quantity")
	private int stockQuantity;
	
	@Column(name = "discount")
	private int discountPercent;
	
	@Column(name = "price", nullable = true)
	private String price;
	
	@Column(name = "created", nullable = false)
	private Date created;
	
	@Column(name = "updated")
	private Date updated;
	
	@Column(name = "deleted")
	private boolean deleted = Boolean.FALSE;
	
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<OrderItem> orderItems = new ArrayList<>();
	
	@ManyToMany(cascade = {
			CascadeType.PERSIST,
			CascadeType.MERGE,
			CascadeType.REFRESH
	})
	@JoinTable(name = "product_categories",
	joinColumns = @JoinColumn(name = "product_id"),
	inverseJoinColumns = @JoinColumn(name = "category_id")
	)
	private Set<Category> categories = new HashSet<>();

	
	
	
	
	
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

	public String getStatus() {
		return status;
	}

	public Product setStatus(String status) {
		this.status = status;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public Product setDescription(String description) {
		this.description = description;
		return this;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public Product setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
		return this;
	}

	public int getDiscountPercent() {
		return discountPercent;
	}

	public Product setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
		return this;
	}

	public String getPrice() {
		return price;
	}

	public Product setPrice(String price) {
		this.price = price;
		return this;
	}

	public Date getCreated() {
		return created;
	}

	public Product setCreated(Date created) {
		this.created = created;
		return this;
	}

	public Date getUpdated() {
		return updated;
	}

	public Product setUpdated(Date updated) {
		this.updated = updated;
		return this;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public Product setDeleted(boolean deleted) {
		this.deleted = deleted;
		return this;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public Product setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
		return this;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public Product setCategories(Set<Category> categories) {
		this.categories = categories;
		return this;
	}
	
	
	
}
