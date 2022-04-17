package com.alfamidia.desenvolvedorjava.semana002.aula004;

import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Imc imcPessoa1 = new Imc (80, 2.10);
		imcPessoa1.calculaImc();
		System.out.printf("IMC: %.2f\n", imcPessoa1.imc);
		System.out.printf("Classifica��o: %s\n", imcPessoa1.classificacaoImc());
		
		//Mesmo valor, mas com classifica��es diferentes, pois os valores s�o herdados pela classe IMC
		Imc imcNovoPessoa1 = new ImcNovo (80, 2.10);
		imcNovoPessoa1.calculaImc();
		System.out.printf("IMC: %.2f\n", imcNovoPessoa1.imc);
		System.out.printf("Classifica��o: %s\n", imcNovoPessoa1.classificacaoImc());
	
	}

}
