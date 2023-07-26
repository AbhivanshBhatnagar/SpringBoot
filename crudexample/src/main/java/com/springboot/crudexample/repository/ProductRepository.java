package com.springboot.crudexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.springboot.crudexample.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    Product findByName(String name);
    
}
