package com.ac.licenta.service;

import com.ac.licenta.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<UserDTO> findAll();

    UserDTO findById(Long id);

    UserDTO findByRfid(String rfid);
}
