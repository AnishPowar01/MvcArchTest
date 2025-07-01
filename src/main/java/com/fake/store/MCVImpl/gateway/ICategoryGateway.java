package com.fake.store.MCVImpl.gateway;

import com.fake.store.MCVImpl.dtos.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryGateway {
    public List<CategoryDTO> getCategories() throws IOException;
}
