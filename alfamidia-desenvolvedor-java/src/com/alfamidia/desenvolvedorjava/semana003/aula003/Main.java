package com.alfamidia.desenvolvedorjava.semana003.aula003;

import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int[] arrayInteiros = { 10, 20, 30, 40, 50 };
		
		for(int i = 0; i < arrayInteiros.length; i++) 
			System.out.println(arrayInteiros[i]);

		System.out.println("---");
		
		//ForEach: função de percorrer o array
		for(int inteiro: arrayInteiros) 
			System.out.println(inteiro);
		
	}
	
	
}
