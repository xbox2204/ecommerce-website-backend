package com.vgc.ecomm.cart.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vineet")
@CrossOrigin(origins = "http://localhost:4200")
@Slf4j
public class CartController {

    @PostMapping
    public ResponseEntity<String> addItem(){}
    @DeleteMapping
    public ResponseEntity<String> deleteItem(){}
    @PostMapping
    public ResponseEntity<String> checkout(){}
}
