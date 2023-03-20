package com.example.springsalesapplications.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springsalesapplications.data.entity.Products;



public interface ProductsRepository extends CrudRepository<Products, Integer> {
}
