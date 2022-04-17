package com.alfamidia.desenvolvedorjava.semana003.aula004;

public class Objetos {
	private int valor1;
	private int valor2;
	
	public Objetos() { }
	
	public Objetos(int v1, int v2) {
		this.valor1 = v1;
		this.valor2 = v2;
	}
	
	public String toString() {
		return "(" + this.valor1 + ", " + this.valor2 + ")";
	}
}
