package com.Nutricionista.Nutricionista.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Nutricionista.Nutricionista.entity.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    List<Consulta> findByPacienteId(Long pacienteId);
}
