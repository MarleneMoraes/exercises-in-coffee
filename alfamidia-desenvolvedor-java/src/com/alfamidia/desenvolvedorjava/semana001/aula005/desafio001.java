package com.alfamidia.desenvolvedorjava.semana001.aula005;

import java.util.Locale;
import java.util.Scanner;

public class desafio001 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		int resposta = 0;
		
		System.out.println("CÁLCULO DO IMC");
		
		do {
			System.out.print("Digite o peso (kg): ");
			double peso = scan.nextDouble();
			
			System.out.print("Digite a altura (m): ");
			double altura = scan.nextDouble();
			
			double imc = peso / (altura * altura);
			System.out.printf("O IMC é: %.2f\n", imc);
			
			String classificacao;
			
			if (imc < 18.5) {
				classificacao = "Magreza";
			} else if (imc < 24.9) {
				classificacao = "Normal";
			} else if (imc < 29.9) {
				classificacao = "Sobrepeso";
			} else if (imc < 39.9) {
				classificacao = "Obesidade";
			} else {
				classificacao = "Obesidade Grave";
			}
			
			System.out.printf("Classificação: %s\n", classificacao);
			
			System.out.println("Calcular novo IMC? (1 sim  0 não)");
			resposta = scan.nextInt();
		} while (resposta != 0);
		
		scan.close();

	}

}
