package com.praticandojava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praticandojava.course.entities.User;

public interface UseRepository extends JpaRepository<User, Long> {
	
}
