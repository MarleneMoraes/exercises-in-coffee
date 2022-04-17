package com.alfamidia.desenvolvedorjava.semana005.aula008;

public abstract class Objetos {
	protected int valor1;
	protected int valor2;
	
	public Objetos() { }
	
	public Objetos(int v1, int v2) {
		this.valor1 = v1;
		this.valor2 = v2;
	}
	
	public String toString() {
		return "(" + this.valor1 + ", " + this.valor2 + ")";
	}
	
	public abstract void exibe();
}
