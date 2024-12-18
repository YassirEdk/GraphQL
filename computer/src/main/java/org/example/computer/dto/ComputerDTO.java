package org.example.computer.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComputerDTO {
    private String proce;
    private String ram;
    private String hardDrive;
    private Float price;
}