package com.arjunan.springbootmongodb.services;

import com.arjunan.springbootmongodb.domain.Product;
import com.arjunan.springbootmongodb.dto.ProductDto;
import com.arjunan.springbootmongodb.mappers.ProductMapper;
import com.arjunan.springbootmongodb.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements  ProductService{

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductServiceImpl(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    /**
     * @return  list of product
     */
    @Override
    public List<Product> listAll() {
        return new ArrayList<>(productRepository.findAll());
    }

    /**
     * @param productDto user date
     * @return created product
     */
    @Override
    public Product saveOrUpdateProductForm(ProductDto productDto) {
        return saveOrUpdate(productMapper.productDtoToProduct(productDto));
    }

    @Override
    public Product saveOrUpdate(Product product) {
        return productRepository.save(product);
    }
}
