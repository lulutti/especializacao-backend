package com.dh.movies.service.impl;

import com.dh.movies.dto.MovieDTO;
import com.dh.movies.entity.Movie;
import com.dh.movies.repository.MovieRepository;
import com.dh.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;

public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepository repository;

    @Override
    public void save(MovieDTO movie) {

    }

    @Override
    public Movie findMovieByGenre(String genre) {
        return null;
    }
}
