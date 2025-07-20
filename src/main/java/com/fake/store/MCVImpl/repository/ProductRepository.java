package com.fake.store.MCVImpl.repository;

import com.fake.store.MCVImpl.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
