package com.ecommerce.CommerceCartAPI.service;

import com.ecommerce.CommerceCartAPI.controller.request.CommerceCartRequest;
import com.ecommerce.CommerceCartAPI.controller.response.PlatziProductResponse;
import com.ecommerce.CommerceCartAPI.entity.CommerceCart;
import com.ecommerce.CommerceCartAPI.entity.Product;
import com.ecommerce.CommerceCartAPI.entity.Status;
import com.ecommerce.CommerceCartAPI.repository.CommerceCartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CommerceCartService {

    private final CommerceCartRepository repository;
    private final ProductService productService;

    public CommerceCart createCart(CommerceCartRequest request) {

        repository.findByClientAndStatus(request.clientId(), Status.OPEN).ifPresent
                (commerce -> {
                    throw new IllegalArgumentException("o corrinho ja esta aberto");
                });

        List<Product> products = new ArrayList<>();

        request.products().forEach(product -> {
            PlatziProductResponse platziProductResponse = productService.getProductById(product.id())
                    .orElseThrow(() -> new RuntimeException("produto nao encontrado"));
            products.add(Product.builder()
                    .id(platziProductResponse.id())
                    .title(platziProductResponse.title())
                    .price(platziProductResponse.price())
                    .quantity(product.quantity())
                    .build());

        });

        CommerceCart commmerce = CommerceCart.builder()
                .client(request.clientId())
                .status(Status.OPEN)
                .products(products)
                .build();

        commmerce.calculateTotalPrices();
        return repository.save(commmerce);
    }
}
