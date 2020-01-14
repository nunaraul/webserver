package com.ac.licenta.service;

import com.ac.licenta.dto.ButtonDTO;

import java.util.List;

public interface ButtonService {

    ButtonDTO findById(Long id);

    List<ButtonDTO> list();

    ButtonDTO click(Long id);
}
