package com.dh.movies.service;

import com.dh.movies.dto.MovieDTO;
import com.dh.movies.entity.Movie;

public interface MovieService {
    void save(MovieDTO movie);
    Movie findMovieByGenre(String genre);
}
