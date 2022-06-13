package com.dh.catalog.controller;

import com.dh.catalog.dto.MovieResponseDto;
import com.dh.catalog.service.impl.CatalogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogServiceImpl service;

    @GetMapping("/{genre}")
    public ResponseEntity<List<MovieResponseDto>> findByGenre(@PathVariable String genre){
        List<MovieResponseDto> movieResponses = service.findMoviesByGenre(genre);
        return !movieResponses.isEmpty() ? ResponseEntity.ok(movieResponses) : ResponseEntity.noContent().build();
    }
}