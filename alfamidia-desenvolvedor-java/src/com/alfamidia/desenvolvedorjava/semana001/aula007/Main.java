package com.alfamidia.desenvolvedorjava.semana001.aula007;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void calculoImc(double peso, double altura) {
		double[] pesosImc = new double [1000];
		String[] classificacoesImc = new String [1000];
		
		double imc = peso / (Math.pow(altura, 2));
		System.out.printf("IMC: %.2f", imc);
		
		for (int i = 0; imc > pesosImc[i]; i++) {
			System.out.printf("Classificação: %s", classificacoesImc[i]);
		}
	}
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		String teste = "s";
		
		//uso do equals
		while(teste.equals("s")) {
			System.out.println("Calcular IMC? (s/n)");
			teste = scan.nextLine(); //lê a string até o enter
			
			if (teste.equals("s")) {
				System.out.println("CÁLCULO DO IMC");
				System.out.print("Digite o peso (kg): ");
				double peso = scan.nextDouble(); //não lê a string até o enter
				scan.nextLine();
				
				System.out.print("Digite a altura (m): ");
				double altura = scan.nextDouble();
				scan.nextLine();
				
				calculoImc(peso,altura);							
			}
		}
		scan.close();
	}

}
