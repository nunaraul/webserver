package com.ac.licenta.service.impl;

import com.ac.licenta.dto.ProductDTO;
import com.ac.licenta.entity.Product;
import com.ac.licenta.mapper.ProductMapper;
import com.ac.licenta.repository.ProductRepository;
import com.ac.licenta.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private final String PRODUCT_NAME = "Product";

    private final ProductMapper productMapper;
    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(final ProductMapper productMapper,
                              final ProductRepository productRepository) {
        this.productMapper = productMapper;
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductDTO> findAll() {
        return productRepository.findAll().stream().map(productMapper::toDTO).collect(Collectors.toList());
    }

    @Override
    public ProductDTO findByRfid(String rfid) {
        return productMapper.toDTO(productRepository.findByRfid(rfid));
    }

    @Override
    public String create(final ProductDTO productDTO) {

        productDTO.setName(PRODUCT_NAME + " " + productRepository.count());
        productDTO.setPrice(new Random().nextDouble() * 100 + 1);
        productDTO.setQuantity(new Random().nextInt(10) + 1);

        Product product = productRepository.findByRfid(productDTO.getRfid());

        if (product == null) {
            return productRepository.save(productMapper.toEntity(productDTO)).getRfid();
        }

        return null;
    }

    @Override
    public String delete(final String rfid) {
        Product product = productRepository.findByRfid(rfid);

        if (product != null) {
            productRepository.delete(product);
            return rfid;
        }

        return null;
    }
}
