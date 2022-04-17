package com.alfamidia.desenvolvedorjava.semana002.aula005;

import java.util.Scanner;

public class Imc {
	Scanner scan = new Scanner (System.in);
	
	// Atributos
	private double peso;
	private double altura;
	protected double imc;
	
	//Construtores
	
	public Imc() { }
	
	public Imc(double p, double h) {
		this.peso = p;
		this.altura = h;
	}

	public void calculaImc() {
		lerDados();
		this.imc = ((this.peso)/Math.pow(this.altura, 2));
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}
	
	
	//Métodos
	public String classificacaoImc() {
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
	
	//Leitura de Dados
	public void lerDados() {
		System.out.println("Peso: ");
		this.setPeso(scan.nextDouble());
		
		System.out.println("Altura: ");
		this.setAltura(scan.nextDouble());
	}

}
