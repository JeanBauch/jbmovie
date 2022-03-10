package com.jeanbauch.jbmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeanbauch.jbmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
}
