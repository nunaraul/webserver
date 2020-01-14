package com.ac.licenta.controller;


import com.ac.licenta.dto.ButtonDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/button")
public interface ButtonApi {

    @GetMapping("/list")
    List<ButtonDTO> list();

    @GetMapping("/{id}")
    ButtonDTO findById(@PathVariable("id") Long id);

    @PutMapping("/{id}/click")
    ButtonDTO click(@PathVariable("id") Long id);
}
