package org.example.computer.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id_Pc;
    private String proce;
    private int ram;
    private String hardDrive;
    private Float price;
}

