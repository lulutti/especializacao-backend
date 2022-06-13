package com.dh.movies.controller;

import com.dh.movies.dto.MovieDTO;
import com.dh.movies.entity.Movie;
import com.dh.movies.service.impl.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieServiceImpl service;

    @PostMapping()
    public ResponseEntity<Void> save (@RequestBody MovieDTO movieDTO){
        service.save(movieDTO);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/{genre}")
    public List<Movie> findMovieByGenre(@PathVariable String genre){
        return service.findMovieByGenre(genre);
    }
}