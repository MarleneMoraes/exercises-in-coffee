package com.alfamidia.desenvolvedorjava.semana002.aula001;

import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Imc imcPessoa1 = new Imc (80, 1.80);
		imcPessoa1.calculaImc();
		System.out.printf("O IMC é %.2f", imcPessoa1.imc);
		
	}

}
