package com.geekbrains.project.persist.model.repo;

import com.geekbrains.project.persist.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
