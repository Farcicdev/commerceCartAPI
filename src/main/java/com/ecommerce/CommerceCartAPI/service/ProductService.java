package com.ecommerce.CommerceCartAPI.service;

import com.ecommerce.CommerceCartAPI.client.PlatziStoreClient;
import com.ecommerce.CommerceCartAPI.controller.response.PlatziProductResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductService {


    private final PlatziStoreClient client;

    @Cacheable(value = "products")
    public List<PlatziProductResponse> getAllProducts() {
        log.info("Getting all products");
        return client.getAllproducts();

    }

    @Cacheable(value = "products", key = "#id")
    public Optional<PlatziProductResponse> getProductById(Long id) {
        log.info("Getting products with id: {}", id);
        return client.getProductById(id);

    }

}
