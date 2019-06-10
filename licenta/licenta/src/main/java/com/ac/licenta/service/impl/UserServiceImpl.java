package com.ac.licenta.service.impl;

import com.ac.licenta.dto.UserDTO;
import com.ac.licenta.entity.User;
import com.ac.licenta.mapper.UserMapper;
import com.ac.licenta.repository.UserRepository;
import com.ac.licenta.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;


    @Autowired
    public UserServiceImpl(final UserMapper userMapper,
                           final UserRepository userRepository) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDTO> findAll() {
//        userRepository.findAll().stream().map(user -> userMapper.toDTO(user)).collect(Collectors.toList());
        List<UserDTO> userDTOs = new ArrayList<>();

        List<User> users = userRepository.findAll();
        for(User user : users) {
            UserDTO u = userMapper.toDTO(user);
            userDTOs.add(u);
        }

        return userDTOs;
    }

    @Override
    public UserDTO findById(final Long id) {
        return userMapper.toDTO(userRepository.findOne(id));
    }

    @Override
    public UserDTO findByRfid(final String rfid) {
        return userMapper.toDTO(userRepository.findByRfid(rfid));
    }
}
