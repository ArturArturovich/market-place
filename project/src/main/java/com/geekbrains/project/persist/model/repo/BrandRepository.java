package com.geekbrains.project.persist.model.repo;

import com.geekbrains.project.controller.repr.CategoryRepr;
import com.geekbrains.project.persist.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;




public interface BrandRepository extends JpaRepository<Brand, Long> {


}
