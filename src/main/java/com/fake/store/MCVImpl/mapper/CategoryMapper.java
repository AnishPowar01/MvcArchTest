package com.fake.store.MCVImpl.mapper;

import com.fake.store.MCVImpl.dtos.CategoryDTO;
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
}
