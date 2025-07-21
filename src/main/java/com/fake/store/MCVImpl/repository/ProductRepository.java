package com.fake.store.MCVImpl.repository;

import com.fake.store.MCVImpl.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("Select p from Product p Where p.price > :minPrice")
    List<Product> findProductByPrice(@Param("minPrice") double minPrice);
}
