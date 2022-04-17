package com.alfamidia.desenvolvedorjava.semana003.aula002;

public class ToString {
	int valor1;

	static int valor2;

	public ToString(int valor1) {
		this.valor1 = valor1;
	}
	
	public int getValor1() {
		return valor1;
	}
	
	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}
	
	public int calcula() {
		return valor1 * ToString.valor2;
	}
	
	public static int getValor2() {
		return valor2;
	}
	
	public static void setValor2(int valor2) {
		ToString.valor2 = valor2;
	}
	
	public String toString() {
		return "O Valor 1 é " + this.valor1 + " e o valor estático valor2 é " + ToString.valor2;
	}
}
