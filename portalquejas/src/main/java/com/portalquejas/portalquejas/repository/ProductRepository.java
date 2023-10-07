package com.portalquejas.portalquejas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.portalquejas.portalquejas.entities.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
    
}
