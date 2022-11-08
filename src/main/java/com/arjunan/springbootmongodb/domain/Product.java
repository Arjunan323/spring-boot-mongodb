package com.arjunan.springbootmongodb.domain;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document
@Getter
@Setter
public class Product {

    private ObjectId _id;
    private String description;
    private BigDecimal price;
    private String imageUrl;
}
