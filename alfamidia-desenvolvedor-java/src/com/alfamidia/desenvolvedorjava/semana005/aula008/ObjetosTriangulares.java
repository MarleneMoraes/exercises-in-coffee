package com.alfamidia.desenvolvedorjava.semana005.aula008;

public class ObjetosTriangulares extends Objetos {
	private int valor3;

	public ObjetosTriangulares(int v1, int v2, int v3) {
		this.valor1 = v1;
		this.valor2 = v2;
		this.valor3 = v3;
	}
	
	
	public String toString() {
		return "(" + this.valor1 + ", " + this.valor2 + ", " + this.valor3 + ")";
	}
	
	public void exibe() {
		System.out.println(this);
	}
}
