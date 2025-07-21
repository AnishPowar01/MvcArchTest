package com.fake.store.MCVImpl.mapper;

import com.fake.store.MCVImpl.dtos.CategoryDTO;
import com.fake.store.MCVImpl.dtos.CategoryProductsDTO;
import com.fake.store.MCVImpl.entity.Category;

public class CategoryMapper {

    public static CategoryDTO toDto(Category category)
    {
        return CategoryDTO.builder().id(category.getId()).name(category.getName()).build();
    }

    public static Category toEntity(CategoryDTO categoryDTO)
    {
        return Category.builder().name(categoryDTO.getName()).build();
    }

    public static CategoryProductsDTO toCategoryProductsDTO(Category category)
    {
        return CategoryProductsDTO.builder().id(category.getId()).name(category.getName()).productDTOList(category.getProducts().stream().map(ProductMapper::toDTO).toList()).build();
    }
}
