package com.fake.store.MCVImpl.service;

import com.fake.store.MCVImpl.dtos.ProductDTO;

public interface IProductService {
    ProductDTO getProductById(Long id) throws Exception;
    ProductDTO createProduct(ProductDTO dto) throws Exception;
}
