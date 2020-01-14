package com.ac.licenta.controller.impl;

import com.ac.licenta.controller.ButtonApi;
import com.ac.licenta.dto.ButtonDTO;
import com.ac.licenta.service.ButtonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ButtonApiImpl implements ButtonApi {

    private final ButtonService buttonService;

    @Autowired
    public ButtonApiImpl(ButtonService buttonService) {
        this.buttonService = buttonService;
    }

    @Override
    public List<ButtonDTO> list() {
        return buttonService.list();
    }

    @Override
    public ButtonDTO findById(Long id) {
        return buttonService.findById(id);
    }

    @Override
    public ButtonDTO click(Long id) {
        return buttonService.click(id);
    }
}
