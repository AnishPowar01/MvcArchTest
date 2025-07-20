package com.fake.store.MCVImpl.repository;

import com.fake.store.MCVImpl.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
