package com.fake.store.MCVImpl.service;

import com.fake.store.MCVImpl.dtos.ProductDTO;
import com.fake.store.MCVImpl.entity.Product;
import com.fake.store.MCVImpl.mapper.ProductMapper;
import com.fake.store.MCVImpl.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService{

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }

    @Override
    public ProductDTO getProductById(Long id) throws Exception {
        ProductDTO dto = productRepository.findById(id).
                map(ProductMapper::toDTO).
                orElseThrow(() -> new Exception("Product not Found"));
        return dto;
    }


    @Override
    public ProductDTO createProduct(ProductDTO dto) {
        Product product = productRepository.save(ProductMapper.toEntity(dto));
        return ProductMapper.toDTO(product);
    }
}
