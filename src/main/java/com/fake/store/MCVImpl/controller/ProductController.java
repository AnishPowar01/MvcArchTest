package com.fake.store.MCVImpl.controller;

import com.fake.store.MCVImpl.dtos.CategoryDTO;
import com.fake.store.MCVImpl.service.ICategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ProductController {

    private ICategoryService iCategoryService;

    public ProductController(ICategoryService iCategoryService)
    {
        this.iCategoryService = iCategoryService;
    }

    @GetMapping("/category")
    public List<CategoryDTO> getCategories() throws IOException {
        return iCategoryService.getCategories();
    }
}
