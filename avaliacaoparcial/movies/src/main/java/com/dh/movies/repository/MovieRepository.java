package com.dh.movies.repository;

import com.dh.movies.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository <Movie, Long> {
    Movie findMovieByGenre(String genre);
}
