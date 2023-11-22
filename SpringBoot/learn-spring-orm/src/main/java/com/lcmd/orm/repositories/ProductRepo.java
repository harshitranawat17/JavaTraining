package com.lcmd.orm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcmd.orm.entities.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
