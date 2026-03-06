package com.ecommerce.CommerceCartAPI.controller.request;

import java.util.List;

public record CommerceCartRequest(
        Long clientId,
        List<ProductsRequest> products
) {
}
