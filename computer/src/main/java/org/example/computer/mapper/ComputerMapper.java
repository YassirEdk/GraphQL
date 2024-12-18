package org.example.computer.mapper;

import org.example.computer.dao.entities.Computer;
import org.example.computer.dto.ComputerDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {
    private final ModelMapper modelMapper = new ModelMapper();

    public ComputerDTO fromComputerToComputerDTO(Computer computer) {
        return modelMapper.map(computer, ComputerDTO.class);
    }
    public Computer fromComputerDTOToComputer(ComputerDTO computerDTO) {
        return modelMapper.map(computerDTO, Computer.class);
    }

}
