package org.example.computer;

import org.example.computer.Service.ComputerService;
import org.example.computer.dto.ComputerDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ComputerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComputerApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ComputerService computerService){
        return  args -> {
            List<ComputerDTO> computersDTO = List.of(
                    ComputerDTO.builder().proce("model1").hardDrive("sdf64w6e").ram("12").price(12345.2f).build(),
                    ComputerDTO.builder().proce("model2").hardDrive("ef6e+6").ram("32").price(65489f).build(),
                    ComputerDTO.builder().proce("model3").hardDrive("ef64we8").ram("15").price(89789f).build(),
                    ComputerDTO.builder().proce("model4").hardDrive("wrdqwqw").ram("16").price(67489f).build()
            );
            for(ComputerDTO computerDTO : computersDTO){
                computerService.saveComputer(computerDTO);
            }
        };
    }

}
