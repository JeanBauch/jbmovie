package com.jeanbauch.jbmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeanbauch.jbmovie.entities.Score;
import com.jeanbauch.jbmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
