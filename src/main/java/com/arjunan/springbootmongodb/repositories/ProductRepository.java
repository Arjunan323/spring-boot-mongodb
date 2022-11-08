package com.arjunan.springbootmongodb.repositories;

import com.arjunan.springbootmongodb.domain.Product;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, ObjectId> {
}
