package com.alfamidia.desenvolvedorjava.semana005.aula008;

public class ObjetosSimples extends Objetos {
	protected int valor1;
	protected int valor2;
	
	public ObjetosSimples() { }
	
	public ObjetosSimples(int v1, int v2) {
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
