package com.dh.movies.service.impl;

import com.dh.movies.dto.MovieDTO;
import com.dh.movies.entity.Movie;
import com.dh.movies.repository.MovieRepository;
import com.dh.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepository repository;

    @Override
    public void save(MovieDTO movieDTO) {
        Movie movie = new Movie();
        movie.setName(movie.getName());
        movie.setGenre(movie.getGenre());
        movie.setUrlStream(movie.getUrlStream());
        repository.save(movie);
    }

    @Override
    public List<Movie> findMovieByGenre(String genre) {
        List<Movie> moviesList = repository.findMovieByGenre(genre);
        return moviesList;
    }
}
