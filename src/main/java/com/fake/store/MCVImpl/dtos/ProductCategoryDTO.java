package com.fake.store.MCVImpl.dtos;

import com.fake.store.MCVImpl.entity.Category;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductCategoryDTO {
    private String image;
    private String color;
    private int price;
    private String description;
    private int discount;
    private String model;
    private Long id;
    private String title;
    private String brand;
    private boolean popular;
    private CategoryDTO category;
}
