package com.alfamidia.desenvolvedorjava.semana003.aula001;

public class ValoresEstaticos {
	int valor1;

	static int valor2;

	public ValoresEstaticos(int valor1) {
		this.valor1 = valor1;
	}
	
	public int getValor1() {
		return valor1;
	}
	
	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}
	
	public int calcula() {
		return valor1 * ValoresEstaticos.valor2;
	}
	
	public static int getValor2() {
		return valor2;
	}
	
	public static void setValor2(int valor2) {
		ValoresEstaticos.valor2 = valor2;
	}
}
