package com.springmvc.ProductApp.repositories;

import com.springmvc.ProductApp.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, String> {
}
