package com.ac.licenta.mapper;

import com.ac.licenta.dto.ProductDTO;
import com.ac.licenta.entity.Product;
import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper {

    ProductDTO toDTO(Product product);

    Product toEntity(ProductDTO productDTO);
}
