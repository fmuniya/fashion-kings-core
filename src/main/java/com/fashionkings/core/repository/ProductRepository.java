package com.fashionkings.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fashionkings.core.jpa.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
