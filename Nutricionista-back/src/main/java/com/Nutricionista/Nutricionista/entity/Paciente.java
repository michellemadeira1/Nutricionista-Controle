package com.Nutricionista.Nutricionista.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Paciente {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    
    private double percentualGordura; 
    private String metasNutricionais;  
    private String historicoAlimentar; 

    private double imc; // Índice de Massa Corporal
    
    
    public Paciente(){}


	public Paciente(Long id, String nome, int idade, double altura, double peso, double percentualGordura,
			String metasNutricionais, String historicoAlimentar, double imc) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.percentualGordura = percentualGordura;
		this.metasNutricionais = metasNutricionais;
		this.historicoAlimentar = historicoAlimentar;
		this.imc = imc;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getPercentualGordura() {
		return percentualGordura;
	}


	public void setPercentualGordura(double percentualGordura) {
		this.percentualGordura = percentualGordura;
	}


	public String getMetasNutricionais() {
		return metasNutricionais;
	}


	public void setMetasNutricionais(String metasNutricionais) {
		this.metasNutricionais = metasNutricionais;
	}


	public String getHistoricoAlimentar() {
		return historicoAlimentar;
	}


	public void setHistoricoAlimentar(String historicoAlimentar) {
		this.historicoAlimentar = historicoAlimentar;
	}


	public double getImc() {
		return imc;
	}


	public void setImc(double imc) {
		this.imc = imc;
	}
   
    
	
    
    
    
    
    
}