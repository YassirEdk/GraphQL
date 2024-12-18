package org.example.computer.Service;

import org.example.computer.dto.ComputerDTO;

import java.util.List;

public interface ComputerService {
    List<ComputerDTO> getComputerByProce(String proce);

    ComputerDTO saveComputer(ComputerDTO computerDTO);
}
