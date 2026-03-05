package com.ecommerce.CommerceCartAPI.service;

import com.ecommerce.CommerceCartAPI.client.PlatziStoreClient;
import com.ecommerce.CommerceCartAPI.controller.response.PlatziProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {


    private final PlatziStoreClient client;

    public List<PlatziProductResponse> getAllProducts() {
        return client.getAllproducts();

    }

    public Optional<PlatziProductResponse> getProductById(Long id) {
        return client.getProductById(id);

    }

}
