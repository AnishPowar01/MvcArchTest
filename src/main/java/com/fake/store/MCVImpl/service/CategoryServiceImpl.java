package com.fake.store.MCVImpl.service;

import com.fake.store.MCVImpl.dtos.CategoryDTO;
import com.fake.store.MCVImpl.gateway.ICategoryGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CategoryServiceImpl {

    private ICategoryGateway iCategoryGateway;

    public CategoryServiceImpl(ICategoryGateway iCategoryGateway)
    {
        this.iCategoryGateway = iCategoryGateway;
    }

//    @Override
//    public List<CategoryDTO> getCategories() throws IOException {
//        return iCategoryGateway.getCategories();
//    }
}
