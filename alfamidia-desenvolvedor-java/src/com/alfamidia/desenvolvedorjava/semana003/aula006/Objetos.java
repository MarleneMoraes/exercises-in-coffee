package com.alfamidia.desenvolvedorjava.semana003.aula006;

public class Objetos {
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
	
	public void exibe() {
		System.out.println(this);
	}
}
