package com.fake.store.MCVImpl.controller;

import com.fake.store.MCVImpl.dtos.CategoryDTO;
import com.fake.store.MCVImpl.service.ICategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    private ICategoryService iCategoryService;

    public CategoryController(ICategoryService iCategoryService)
    {
        this.iCategoryService = iCategoryService;
    }

    @PostMapping
    public ResponseEntity<CategoryDTO> createCategory(@RequestBody CategoryDTO dto)
    {
        CategoryDTO categoryDTO = iCategoryService.createCategory(dto);
        return ResponseEntity.ok(categoryDTO);
    }

    @GetMapping
    public
}
