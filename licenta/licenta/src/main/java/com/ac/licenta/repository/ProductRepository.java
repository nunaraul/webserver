package com.ac.licenta.repository;

import com.ac.licenta.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByRfid(String rfid);
}
