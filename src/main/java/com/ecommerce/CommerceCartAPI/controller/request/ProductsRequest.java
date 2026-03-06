package com.ecommerce.CommerceCartAPI.controller.request;

public record ProductsRequest(
        Long id,
        Integer quantity
) {
}
