package com.alfamidia.desenvolvedorjava.semana003.aula006;

public class ObjetosTriangulares extends Objetos {
	private int valor3;

	public ObjetosTriangulares(int v1, int v2, int v3) {
		super(v1, v2);
		this.valor3 = v3;
	}
	
	
	public String toString() {
		return "(" + this.valor1 + ", " + this.valor2 + ", " + this.valor3 + ")";
	}
}
