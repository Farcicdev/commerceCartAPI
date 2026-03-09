package com.ecommerce.CommerceCartAPI.controller;


import com.ecommerce.CommerceCartAPI.controller.request.CommerceCartRequest;
import com.ecommerce.CommerceCartAPI.entity.CommerceCart;
import com.ecommerce.CommerceCartAPI.service.CommerceCartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/commerce")
@RequiredArgsConstructor
public class CommerceCartController {

    private final CommerceCartService service;

    @PostMapping
    public ResponseEntity<CommerceCart> creatCart(@RequestBody CommerceCartRequest request){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createCart(request));
    }
}
