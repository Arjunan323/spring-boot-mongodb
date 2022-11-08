package com.arjunan.springbootmongodb.services;

import com.arjunan.springbootmongodb.domain.Product;
import com.arjunan.springbootmongodb.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements  ProductService{

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /**
     * @return  list of product
     */
    @Override
    public List<Product> listAll() {
        return new ArrayList<>(productRepository.findAll());
    }
}
