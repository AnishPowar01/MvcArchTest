package com.fake.store.MCVImpl.dtos;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryResponseDTO {
    public String status;
    public String message;
    public List<String> categories;
}
