package com.devfactory.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devfactory.dsmovie.entities.Movie;


public interface MovieRepository extends JpaRepository<Movie, Long> {

}
