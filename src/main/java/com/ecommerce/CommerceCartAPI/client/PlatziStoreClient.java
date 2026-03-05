package com.ecommerce.CommerceCartAPI.client;

import com.ecommerce.CommerceCartAPI.controller.response.PlatziProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@FeignClient(name = "PlatziStoreClient", url = "${platzi.client.url}")
public interface PlatziStoreClient {

    @GetMapping("/products")
    List<PlatziProductResponse> getAllproducts();

    @GetMapping("/products/{id}")
    Optional<PlatziProductResponse> getProductById(@PathVariable Long id);
}
