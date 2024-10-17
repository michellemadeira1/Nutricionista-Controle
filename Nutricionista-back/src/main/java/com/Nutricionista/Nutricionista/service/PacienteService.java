package com.Nutricionista.Nutricionista.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nutricionista.Nutricionista.entity.Paciente;
import com.Nutricionista.Nutricionista.repository.PacienteRepository;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

   
    public List<Paciente> listarTodos() {
        return pacienteRepository.findAll();
    }

    
    public Optional<Paciente> buscarPorId(Long id) {
        return pacienteRepository.findById(id);
    }

    // Cadastrar ou atualizar paciente
    public Paciente salvarOuAtualizar(Paciente paciente) {
        calcularIMC(paciente); // Recalcular IMC antes de salvar
        return pacienteRepository.save(paciente);
    }

  
    public boolean deletar(Long id) {
        if (pacienteRepository.existsById(id)) {
            pacienteRepository.deleteById(id);
            return true;
        }
        return false;
    }

    
    public boolean pacienteExiste(Long id) {
        return pacienteRepository.existsById(id);
    }

    // Lógica de negócio: Calcular o IMC do paciente
    private void calcularIMC(Paciente paciente) {
        if (paciente.getAltura() > 0 && paciente.getPeso() > 0) {
            paciente.setImc(paciente.getPeso() / (paciente.getAltura() * paciente.getAltura()));
        } else {
            paciente.setImc(0);
        }
    }
}

