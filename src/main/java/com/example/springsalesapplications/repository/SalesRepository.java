package com.example.springsalesapplications.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springsalesapplications.data.entity.Sales;




public interface SalesRepository extends CrudRepository<Sales, Integer> {
}