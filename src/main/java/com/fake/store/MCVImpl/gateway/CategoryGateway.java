package com.fake.store.MCVImpl.gateway;

import com.fake.store.MCVImpl.dtos.CategoryDTO;
import com.fake.store.MCVImpl.dtos.CategoryResponseDTO;
import com.fake.store.MCVImpl.gateway.apis.ICategoryAPI;
import org.springframework.stereotype.Component;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

@Component
public class CategoryGateway implements ICategoryGateway{

    private ICategoryAPI iCategoryAPI;

    public CategoryGateway(ICategoryAPI iCategoryAPI)
    {
        this.iCategoryAPI = iCategoryAPI;
    }

    @Override
    public List<CategoryDTO> getCategories() throws IOException {
        CategoryResponseDTO categoryResponseDTO = iCategoryAPI.getCategories().execute().body();

        if(categoryResponseDTO == null){
            throw new IOException("Failed to fetch categories from FakeStore API");
        }

        return categoryResponseDTO.getCategories().stream().
                map(category -> CategoryDTO.builder().name(category).
                        build()).
                toList();
    }
}
