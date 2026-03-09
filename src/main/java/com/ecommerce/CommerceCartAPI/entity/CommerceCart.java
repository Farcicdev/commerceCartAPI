package com.ecommerce.CommerceCartAPI.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Document(collection = "commerce")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CommerceCart {

    @Id
    private String id;

    private Long client;

    private BigDecimal totalPrice;

    private List<Product> products;

    private Status status;

    public void calculateTotalPrices() {
        this.totalPrice = products.stream()
                .map(product -> product.getPrice().multiply(BigDecimal.valueOf(product.getQuantity())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}
