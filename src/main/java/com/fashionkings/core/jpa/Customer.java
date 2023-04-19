package com.fashionkings.core.jpa;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_id")
	private long id;
	
	@Column(name = "customer_name", nullable = false)
	private String name;
	
	@Column(name = "email", nullable = false)
	private String email;
	
		
	@Column(name = "created", nullable = false)
	private Date created;
	
	@Column(name = "updated")
	private Date updated;
	
	@Column(name = "deleted")
	private boolean deleted = Boolean.FALSE;

}
