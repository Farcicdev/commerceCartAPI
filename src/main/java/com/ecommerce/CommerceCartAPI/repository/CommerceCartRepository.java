package com.ecommerce.CommerceCartAPI.repository;

import com.ecommerce.CommerceCartAPI.entity.CommerceCart;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommerceCartRepository extends MongoRepository<CommerceCart, String> {
}
