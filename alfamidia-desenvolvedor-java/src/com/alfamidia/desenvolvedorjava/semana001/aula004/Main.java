package com.alfamidia.desenvolvedorjava.semana001.aula004;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void calculoImc(double peso, double altura) {
		double[] pesosImc = {18.5, 24.9, 29.9, 39.9, 900000 };
		String[] classificacoesImc = {"Magreza", "Normal", "Sobrepeso", "Obesidade", "Obesidade Grave"};
		
		double imc = peso / (Math.pow(altura, 2));
		System.out.printf("IMC: %.2f", imc);
		
		for (int i = 0; imc > pesosImc[i]; i++) {
			System.out.printf("Classificação: %s", classificacoesImc[i]);
		}
	}
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		
		System.out.println("CÁLCULO DO IMC");
		System.out.print("Digite o peso (kg): ");
		double peso = scan.nextDouble();
		
		System.out.print("Digite a altura (m): ");
		double altura = scan.nextDouble();
		
		calculoImc(peso,altura);
		scan.close();
	}

}
