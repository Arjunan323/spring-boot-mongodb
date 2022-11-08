package com.arjunan.springbootmongodb.services;

import com.arjunan.springbootmongodb.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> listAll();
}
