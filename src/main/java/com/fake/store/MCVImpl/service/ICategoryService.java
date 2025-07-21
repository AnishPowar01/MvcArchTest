package com.fake.store.MCVImpl.service;

import com.fake.store.MCVImpl.controller.CategoryController;
import com.fake.store.MCVImpl.dtos.CategoryDTO;
import com.fake.store.MCVImpl.dtos.CategoryProductsDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryService {

    public CategoryDTO createCategory(CategoryDTO categoryDTO);
    public List<CategoryDTO> getCategories() throws IOException;
    public CategoryDTO getCategoryByName(String Name) throws Exception;
    public CategoryProductsDTO getCategoryDetails(Long id) throws Exception;
}
