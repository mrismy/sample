package com.rismy.ecom_proj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rismy.ecom_proj.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

}