package com.alfamidia.desenvolvedorjava.semana002.aula001;

public class Imc {
	// Atributos
	public double peso;
	public double altura;
	public double imc;
	
	//Construtores
	
	public Imc() { }
	
	public Imc(int p, double h) {
		this.peso = p;
		this.altura = h;
	}

	public void calculaImc() {
		this.imc = ((this.peso)/Math.pow(this.altura, 2));
	}
	
}
