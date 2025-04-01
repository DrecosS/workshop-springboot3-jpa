package com.praticandojava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praticandojava.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
