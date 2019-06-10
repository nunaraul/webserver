package com.ac.licenta.controller;


import com.ac.licenta.dto.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/user")
public interface UserApi {

    @GetMapping("/{rfid}")
    UserDTO findByRfid(@PathVariable("rfid") String rfid);

    @GetMapping("/list")
    List<UserDTO> findAll();
}
