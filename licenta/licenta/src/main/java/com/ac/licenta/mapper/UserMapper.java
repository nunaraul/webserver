package com.ac.licenta.mapper;

import com.ac.licenta.dto.UserDTO;
import com.ac.licenta.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    UserDTO toDTO(User user);
}
