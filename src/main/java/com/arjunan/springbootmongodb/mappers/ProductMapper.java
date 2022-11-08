package com.arjunan.springbootmongodb.mappers;

import com.arjunan.springbootmongodb.domain.Product;
import com.arjunan.springbootmongodb.dto.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {ObjectIdMapper.class})
public interface ProductMapper {

    @Mapping(target = "_id", source = "id")
    Product productDtoToProduct(ProductDto productDto);

    @Mapping(target = "id", source = "_id")
    ProductDto productToProductDto(Product product);
}
