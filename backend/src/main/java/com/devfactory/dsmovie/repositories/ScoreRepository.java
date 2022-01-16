package com.devfactory.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devfactory.dsmovie.entities.Score;
import com.devfactory.dsmovie.entities.ScorePK;


public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
