package org.example.computer.dao.repositories;

import org.example.computer.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer, String> {
    List<Computer> findByProce(String proce);


}
