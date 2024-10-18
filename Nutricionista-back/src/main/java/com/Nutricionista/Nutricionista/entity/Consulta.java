package com.Nutricionista.Nutricionista.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private LocalDate data;
    private LocalTime hora;
    
    
    
    
    public Consulta() {}
    
	public Consulta(Long id, LocalDate data, LocalTime hora) {
		super();
		this.id = id;
		this.data = data;
		this.hora = hora;
	}

	
	
	
	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public void setPaciente(Paciente paciente) {
		// TODO Auto-generated method stub
		
	}



}
