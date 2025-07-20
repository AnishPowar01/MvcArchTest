package com.fake.store.MCVImpl.controller;

import com.fake.store.MCVImpl.dtos.CategoryDTO;
import com.fake.store.MCVImpl.dtos.ProductDTO;
import com.fake.store.MCVImpl.service.ICategoryService;
import com.fake.store.MCVImpl.service.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ProductController {

    private IProductService iProductService;

    public ProductController(IProductService iProductService)
    {
        this.iProductService = iProductService;
    }

//    @GetMapping("/category")
//    public List<CategoryDTO> getCategories() throws IOException {
//        return iCategoryService.getCategories();
//    }

    @GetMapping("/product/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable Long id) throws Exception{
        ProductDTO dto = this.iProductService.getProductById(id);
        return ResponseEntity.ok(dto);
    }

    @PostMapping("/product/addProduct")
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO productDTO)
    {
        return ResponseEntity.ok(iProductService.createProduct(productDTO));
    }
}
