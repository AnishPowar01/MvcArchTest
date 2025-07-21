package com.fake.store.MCVImpl.mapper;

import com.fake.store.MCVImpl.dtos.ProductCategoryDTO;
import com.fake.store.MCVImpl.dtos.ProductDTO;
import com.fake.store.MCVImpl.entity.Category;
import com.fake.store.MCVImpl.entity.Product;

public class ProductMapper {

    public static ProductDTO toDTO(Product product)
    {
        return ProductDTO.builder()
                .id(product.getId())
                .image(product.getImage())
                .color(product.getColor())
                .price(product.getPrice())
                .description(product.getDescription())
                .discount(product.getDiscount())
                .model(product.getModel())
                .title(product.getTitle())
                .brand(product.getBrand())
                .categoryId(product.getCategory().getId())
                .popular(product.isPopular())
                .build();
    }


    public static Product toEntity(ProductDTO productDTO, Category category)
    {
        return Product.builder()
                .image(productDTO.getImage())
                .color(productDTO.getColor())
                .price(productDTO.getPrice())
                .description(productDTO.getDescription())
                .discount(productDTO.getDiscount())
                .model(productDTO.getModel())
                .title(productDTO.getTitle())
                .brand(productDTO.getBrand())
                .category(category)
                .popular(productDTO.isPopular())
                .build();
    }

    public static ProductCategoryDTO toProductCategoryDTO(Product product)
    {
        return ProductCategoryDTO.builder().id(product.getId())
            .image(product.getImage())
            .color(product.getColor())
            .price(product.getPrice())
            .description(product.getDescription())
            .discount(product.getDiscount())
            .model(product.getModel())
            .title(product.getTitle())
            .brand(product.getBrand())
            .popular(product.isPopular()).category(CategoryMapper.toDto(product.getCategory())).build();
    }
}
