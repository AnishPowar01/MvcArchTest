package com.fake.store.MCVImpl.service;

import com.fake.store.MCVImpl.dtos.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryService {

    public CategoryDTO createCategory(CategoryDTO categoryDTO);
    public List<CategoryDTO> getCategories() throws IOException;
}
