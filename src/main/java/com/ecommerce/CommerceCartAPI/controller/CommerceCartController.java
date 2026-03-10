package com.ecommerce.CommerceCartAPI.controller;


import com.ecommerce.CommerceCartAPI.controller.request.CommerceCartRequest;
import com.ecommerce.CommerceCartAPI.entity.CommerceCart;
import com.ecommerce.CommerceCartAPI.service.CommerceCartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/commerce")
@RequiredArgsConstructor
public class CommerceCartController {

    private final CommerceCartService service;

    @PostMapping
    public ResponseEntity<CommerceCart> creatCart(@RequestBody CommerceCartRequest request){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createCart(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CommerceCart> findByid(@PathVariable String id){
        return ResponseEntity.ok(service.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CommerceCart> savedCommerce(@RequestBody CommerceCartRequest request, @PathVariable String id){
        return ResponseEntity.ok(service.updateCommerceCart(id, request));
    }
}
