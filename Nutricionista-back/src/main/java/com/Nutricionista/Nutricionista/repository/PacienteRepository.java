package com.Nutricionista.Nutricionista.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.Nutricionista.Nutricionista.entity.Paciente;


public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    
}

