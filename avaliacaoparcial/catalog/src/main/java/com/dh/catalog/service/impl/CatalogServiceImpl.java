package com.dh.catalog.service.impl;

import com.dh.catalog.dto.MovieResponseDto;
import com.dh.catalog.service.CatalogService;
import com.dh.catalog.service.MovieFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private MovieFeign movieFeign;

    @Override
    public List<MovieResponseDto> findMoviesByGenre(String genre) {
        return movieFeign.findMovies(genre);
    }
}