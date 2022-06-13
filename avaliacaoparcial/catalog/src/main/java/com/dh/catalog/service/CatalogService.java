package com.dh.catalog.service;

import com.dh.catalog.dto.MovieResponseDto;

import java.util.List;

public interface CatalogService {
    List<MovieResponseDto> findMoviesByGenre(String genre);
}
