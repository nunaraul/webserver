package com.ac.licenta.service.impl;

import com.ac.licenta.dto.ButtonDTO;
import com.ac.licenta.entity.Button;
import com.ac.licenta.mapper.ButtonMapper;
import com.ac.licenta.repository.ButtonRepository;
import com.ac.licenta.service.ButtonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class ButtonServiceImpl implements ButtonService {

    private final ButtonRepository buttonRepository;
    private final ButtonMapper buttonMapper;

    @Autowired
    public ButtonServiceImpl(ButtonRepository buttonRepository,
                             ButtonMapper buttonMapper) {
        this.buttonRepository = buttonRepository;
        this.buttonMapper = buttonMapper;
    }

    @Override
    public ButtonDTO findById(Long id) {
        return buttonMapper.toDTO(buttonRepository.findOne(id));
    }

    @Override
    public List<ButtonDTO> list() {
        return buttonRepository.findAll().stream().map(buttonMapper::toDTO).collect(Collectors.toList());
    }

    @Override
    public ButtonDTO click(Long id) {
        final Button button = buttonRepository.findOne(id);
        if (Objects.nonNull(button)) {
            long clickCount = button.getClickCount() == null ? 0 : (long) button.getClickCount();
            clickCount++;
            button.setClickCount(clickCount);
            buttonRepository.save(button);

            return buttonMapper.toDTO(button);
        }
        return null;
    }
}
