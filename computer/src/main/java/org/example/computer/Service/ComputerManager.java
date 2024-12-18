package org.example.computer.Service;


import org.example.computer.dao.entities.Computer;
import org.example.computer.dao.repositories.ComputerRepository;
import org.example.computer.dto.ComputerDTO;
import org.example.computer.mapper.ComputerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class ComputerManager implements ComputerService{
    @Autowired
    private ComputerRepository computerRepository;
    @Autowired
    private ComputerMapper computerMapper;

    @Override
    public List<ComputerDTO> getComputerByProce(String proce) {
        List<Computer> computers = computerRepository.findByProce(proce);
        List<ComputerDTO> computersDTO = new ArrayList<>();
        for (Computer computer : computers) {
            computersDTO.add(computerMapper.fromComputerToComputerDTO(computer));
        }
        return computersDTO;
    }
    @Override
    public ComputerDTO saveComputer(ComputerDTO computerDTO) {
        Computer computer = computerMapper.fromComputerDTOToComputer(computerDTO);
        Computer computer1 = computerRepository.save(computer);
        return computerMapper.fromComputerToComputerDTO(computer1);
    }
}
