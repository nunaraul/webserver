package com.ac.licenta.controller.impl;

import com.ac.licenta.controller.UserApi;
import com.ac.licenta.dto.UserDTO;
import com.ac.licenta.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserApiImpl implements UserApi {

    private final UserService userService;

    @Autowired
    public UserApiImpl(final UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDTO findByRfid(@PathVariable("rfid") final String rfid) {
        return userService.findByRfid(rfid);
    }

    @Override
    public List<UserDTO> findAll() {
        return userService.findAll();
    }
}
