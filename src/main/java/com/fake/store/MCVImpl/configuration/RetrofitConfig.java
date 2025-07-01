package com.fake.store.MCVImpl.configuration;

import com.fake.store.MCVImpl.gateway.apis.ICategoryAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfig {

    @Bean
    public Retrofit retrofit()
    {
        return new Retrofit.Builder().
                baseUrl("https://fakestoreapi.in/api/").
                addConverterFactory(GsonConverterFactory.create()).
                build();
    }

    @Bean
    public ICategoryAPI iCategoryAPI(Retrofit retrofit)
    {
        return retrofit.create(ICategoryAPI.class);
    }
}
