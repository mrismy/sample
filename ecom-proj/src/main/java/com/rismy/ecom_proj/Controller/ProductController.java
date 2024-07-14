package com.rismy.ecom_proj.controller;

import com.rismy.ecom_proj.model.Product;
import com.rismy.ecom_proj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;
    @RequestMapping("/")
    public String greet(){
        return "Hello World";
    }

    @GetMapping("/product")
    public List<Product> getAllProducts(){
        return service.getAllProdct();
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product prod){
        service.addProduct(prod);
        

    }
}
