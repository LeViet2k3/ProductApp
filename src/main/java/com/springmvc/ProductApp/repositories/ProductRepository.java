package com.springmvc.ProductApp.repositories;

import com.springmvc.ProductApp.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {
    Iterable<Product> findByCategoryID(String categoryID);
}
