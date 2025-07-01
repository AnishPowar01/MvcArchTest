package com.fake.store.MCVImpl.gateway.apis;

import com.fake.store.MCVImpl.dtos.CategoryDTO;
import com.fake.store.MCVImpl.dtos.CategoryResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface ICategoryAPI {

    @GET("products/category")
    Call<CategoryResponseDTO> getCategories();
}
