package com.jeanbauch.jbmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeanbauch.jbmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
