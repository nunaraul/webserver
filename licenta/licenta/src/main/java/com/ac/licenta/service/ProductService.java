package com.ac.licenta.service;

import com.ac.licenta.dto.ProductDTO;

import java.util.List;

public interface ProductService {

    List<ProductDTO> findAll();

    ProductDTO findByRfid(String rfid);

    String create(ProductDTO productDTO);

    String delete(String rfid);
}
