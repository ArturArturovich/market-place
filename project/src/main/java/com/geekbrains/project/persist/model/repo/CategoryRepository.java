package com.geekbrains.project.persist.model.repo;

import com.geekbrains.project.controller.repr.CategoryRepr;
import com.geekbrains.project.persist.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Query("select new com.geekbrains.project.controller.repr.CategoryRepr(c.id, c.name, count(p.id)) " +
            "from Category c " +
            "left join c.products p " +
            "group by c.id, c.name")
    List<CategoryRepr> getAllCategoryRepr();
}
