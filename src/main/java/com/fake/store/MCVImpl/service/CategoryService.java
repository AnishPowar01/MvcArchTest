package com.fake.store.MCVImpl.service;

import com.fake.store.MCVImpl.dtos.CategoryDTO;
import com.fake.store.MCVImpl.dtos.CategoryProductsDTO;
import com.fake.store.MCVImpl.entity.Category;
import com.fake.store.MCVImpl.mapper.CategoryMapper;
import com.fake.store.MCVImpl.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    private CategoryRepository repository;

    public CategoryService(CategoryRepository categoryRepository)
    {
        this.repository = categoryRepository;
    }

    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO) {

        Category category =  repository.save(CategoryMapper.toEntity(categoryDTO));
        return CategoryMapper.toDto(category);
//        return null;
    }

    @Override
    public List<CategoryDTO> getCategories() throws IOException {
        List<Category> categories = repository.findAll();
        return categories.stream().map(cat -> CategoryMapper.toDto(cat)).toList();
    }

    @Override
    public CategoryDTO getCategoryByName(String Name) throws Exception {
        Category category = repository.findByName(Name).orElseThrow(()-> new Exception("Category Not Found"));

        return CategoryMapper.toDto(category);
    }

    @Override
    public CategoryProductsDTO getCategoryDetails(Long id) throws Exception {

        Category category = repository.findById(id).orElseThrow(() -> new Exception("Invalid Category Id"));

        return CategoryMapper.toCategoryProductsDTO(category);
    }
}
