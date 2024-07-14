package com.rismy.ecom_proj.service;

import com.rismy.ecom_proj.model.Product;
import com.rismy.ecom_proj.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProdct() {
        return repo.findAll();
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }
}
