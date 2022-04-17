package com.alfamidia.desenvolvedorjava.semana005.aula005;

enum Estacoes {
	//ENUM: conjunto de valores fixos
	PRIMAVERA, VERAO, OUTONO, INVERNO;
}

public class EnumExamples {

	public static void main(String[] args) {
		Estacoes estacaoAtual = Estacoes.PRIMAVERA;

		switch (estacaoAtual) {
		case PRIMAVERA:
			System.out.println("� primavera");
			break;
		case VERAO:
			System.out.println("� ver�o");
			break;
		case OUTONO:
			System.out.println("� outono");
			break;
		case INVERNO:
			System.out.println("� inverno");
			break;
		}
		
		String x = estacaoAtual.toString(); //transformou o enum em string
		System.out.println(x);
		
		System.out.println(estacaoAtual.ordinal());
		
		//Imprime todos os enums
		for(Estacoes e: Estacoes.values())
			System.out.println(e);

	}

}
