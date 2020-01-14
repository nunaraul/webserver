package com.ac.licenta.mapper;

import com.ac.licenta.dto.ButtonDTO;
import com.ac.licenta.entity.Button;
import org.mapstruct.Mapper;

@Mapper
public interface ButtonMapper {
    ButtonDTO toDTO(Button button);
}
