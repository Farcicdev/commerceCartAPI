package com.ecommerce.CommerceCartAPI.controller.response;

import lombok.Builder;
import java.io.Serializable;
import java.math.BigDecimal;

@Builder
public record PlatziProductResponse(
        Long id,
        String title,
        BigDecimal price,
        String description
) implements Serializable {
}
