package com.ac.licenta.controller.impl;

import com.ac.licenta.controller.ProductApi;
import com.ac.licenta.dto.ProductDTO;
import com.ac.licenta.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductApiImpl implements ProductApi {

    private final ProductService productService;

    @Autowired
    public ProductApiImpl(final ProductService productService) {
        this.productService = productService;
    }

    @Override
    public List<ProductDTO> findAll() {
        return productService.findAll();
    }

    @Override
    public ProductDTO findByRfid(@PathVariable("rfid") String rfid) {
        return productService.findByRfid(rfid);
    }

    @Override
    public String create(@RequestBody ProductDTO productDTO) {
        return productService.create(productDTO);
    }

    @Override
    public String delete(@PathVariable("rfid") String rfid) {
        return productService.delete(rfid);
    }
}
