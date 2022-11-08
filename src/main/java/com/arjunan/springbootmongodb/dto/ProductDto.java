package com.arjunan.springbootmongodb.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductDto {

    private String id;
    private String description;
    private BigDecimal price;
    private String imageUrl;
}
