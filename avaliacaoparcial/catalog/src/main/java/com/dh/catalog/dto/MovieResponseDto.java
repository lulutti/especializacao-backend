package com.dh.catalog.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieResponseDto {
    private Long id;
    private String name;
    private String genre;
    private String urlStream;
}
