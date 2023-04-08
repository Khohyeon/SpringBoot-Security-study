package com.side.serverusercatchproject.modules.category.repository;

import com.side.serverusercatchproject.modules.category.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
