package com.arjunan.springbootmongodb.services;

import com.arjunan.springbootmongodb.domain.Product;
import com.arjunan.springbootmongodb.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<Product> listAll();

    Product saveOrUpdateProductForm(ProductDto productDto);

    Product saveOrUpdate(Product product);

    Product getById(String id);

    void delete(String id);
}
