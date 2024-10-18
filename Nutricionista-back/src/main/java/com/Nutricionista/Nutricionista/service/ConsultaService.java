package com.Nutricionista.Nutricionista.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nutricionista.Nutricionista.entity.Consulta;
import com.Nutricionista.Nutricionista.entity.Paciente;
import com.Nutricionista.Nutricionista.repository.ConsultaRepository;
import com.Nutricionista.Nutricionista.repository.PacienteRepository;

@Service
public class ConsultaService {

    @Autowired
    private ConsultaRepository consultaRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    // Agendar uma nova consulta para um paciente
    public Consulta agendarConsulta(Consulta consulta, Long pacienteId) {
        Optional<Paciente> paciente = pacienteRepository.findById(pacienteId);
        if (paciente.isPresent()) {
            consulta.setPaciente(paciente.get());
            return consultaRepository.save(consulta);
        } else {
            throw new RuntimeException("Paciente não encontrado.");
        }
    }

    // Listar consultas de um paciente específico
    public List<Consulta> listarConsultasPorPaciente(Long pacienteId) {
        return consultaRepository.findByPacienteId(pacienteId);
    }

    // Cancelar uma consulta pelo ID
    public boolean cancelarConsulta(Long id) {
        if (consultaRepository.existsById(id)) {
            consultaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
