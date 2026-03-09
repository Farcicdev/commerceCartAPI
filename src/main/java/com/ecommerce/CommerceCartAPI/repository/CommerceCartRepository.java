package com.ecommerce.CommerceCartAPI.repository;

import com.ecommerce.CommerceCartAPI.entity.CommerceCart;
import com.ecommerce.CommerceCartAPI.entity.Status;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CommerceCartRepository extends MongoRepository<CommerceCart, String> {

    Optional<CommerceCart> findByClientAndStatus(Long client, Status status);

}
