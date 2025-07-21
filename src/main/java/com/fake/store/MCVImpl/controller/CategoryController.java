package com.fake.store.MCVImpl.controller;

import com.fake.store.MCVImpl.dtos.CategoryDTO;
import com.fake.store.MCVImpl.entity.Category;
import com.fake.store.MCVImpl.service.ICategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

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
    public ResponseEntity<?> getAllCategories(@RequestParam(required = false) String name) throws Exception {
        if(name!=null && !name.isBlank())
        {
            return ResponseEntity.ok(iCategoryService.getCategoryByName(name));
        }
        return ResponseEntity.ok(iCategoryService.getCategories());
    }

    @GetMapping("/{id}/details")
    public ResponseEntity<?> getCategoryDetails(@PathVariable Long id) throws Exception {
        return ResponseEntity.ok(iCategoryService.getCategoryDetails(id));
    }
}
