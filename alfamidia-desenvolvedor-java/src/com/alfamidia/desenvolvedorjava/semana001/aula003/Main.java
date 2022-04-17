package com.alfamidia.desenvolvedorjava.semana001.aula003;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		System.out.println("C�LCULO DO IMC");
		System.out.print("Digite o peso (kg): ");
		double peso = scan.nextDouble();
		
		System.out.print("Digite a altura (m): ");
		double altura = scan.nextDouble();
		
		double imc = peso / (altura * altura);
		System.out.printf("O IMC �: %.2f\n", imc);
		
		String classificacao;
		if (imc < 18.5) classificacao = "Magreza";
		else if (imc < 24.9) classificacao = "Normal";
		else if (imc < 29.9) classificacao = "Sobrepeso";
		else if (imc < 39.9) classificacao = "Obesidade";
		else classificacao = "Obesidade Grave";
		
		System.out.printf("Classifica��o: %s", classificacao);
		
		scan.close();
	}

}
