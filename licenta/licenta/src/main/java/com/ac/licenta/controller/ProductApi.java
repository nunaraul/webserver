package com.ac.licenta.controller;


import com.ac.licenta.dto.ProductDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/product")
public interface ProductApi {

    @GetMapping("/list")
    List<ProductDTO> findAll();

    @GetMapping("/{rfid}")
    ProductDTO findByRfid(@PathVariable("rfid") String rfid);

    @PostMapping("/create")
    String create(@RequestBody ProductDTO productDTO);

    @PostMapping("/{rfid}/delete")
    String delete(@PathVariable("rfid") String rfid);
}
