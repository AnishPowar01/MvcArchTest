package com.fake.store.MCVImpl.dtos;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryProductsDTO {
    private Long id;
    private String name;

    private List<ProductDTO> productDTOList;
}
