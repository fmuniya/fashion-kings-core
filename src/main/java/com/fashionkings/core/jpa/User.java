package com.fashionkings.core.jpa;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	//@Column(name = "status")
	//@Enumerated(EnumType.STRING)
	//private ActiveOrInactive status;
	
	@Column(name = "created", nullable = false)
	private Date created;
	
	@Column(name = "updated")
	private Date updated;
	
	@Column(name = "deleted")
	private boolean deleted = Boolean.FALSE;

}
