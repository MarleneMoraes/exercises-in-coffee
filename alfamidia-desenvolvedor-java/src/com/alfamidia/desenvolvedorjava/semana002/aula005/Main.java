package com.alfamidia.desenvolvedorjava.semana002.aula005;

import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Imc imcPessoa = new Imc();
		
		imcPessoa.calculaImc();
		System.out.printf("IMC: %.2f\n", imcPessoa.imc);
		System.out.printf("Classificação: %s\n", imcPessoa.classificacaoImc());
		
	}

}
