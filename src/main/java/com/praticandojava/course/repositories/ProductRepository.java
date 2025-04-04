package com.praticandojava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praticandojava.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
