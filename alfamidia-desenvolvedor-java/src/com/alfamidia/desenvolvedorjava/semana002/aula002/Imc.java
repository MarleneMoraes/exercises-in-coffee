package com.alfamidia.desenvolvedorjava.semana002.aula002;

public class Imc {
	// Atributos
	public double peso;
	public double altura;
	public double imc;
	
	//Construtores
	
	public Imc() { }
	
	public Imc(double p, double h) {
		this.peso = p;
		this.altura = h;
	}

	public void calculaImc() {
		this.imc = ((this.peso)/Math.pow(this.altura, 2));
	}
	
	public String classificacaoImc() {
		calculaImc();
		if (this.imc < 18.5) {
			return "Magreza";
		} else if (this.imc < 24.9) {
			return "Normal";
		} else if (this.imc < 29.9) {
			return "Sobrepeso";
		} else if (this.imc < 39.9) {
			return "Obesidade";
		} else {
			return "Obesidade Grave";
		}
	}
	
}
