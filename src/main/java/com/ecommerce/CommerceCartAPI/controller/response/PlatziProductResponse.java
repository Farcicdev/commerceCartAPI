package com.ecommerce.CommerceCartAPI.controller.response;

import java.math.BigDecimal;

public record PlatziProductResponse(
        Long id,
        String title,
        BigDecimal price,
        String description
) {
}
