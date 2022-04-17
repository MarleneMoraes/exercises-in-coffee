package com.alfamidia.desenvolvedorjava.semana003.aula002;

import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		ToString.setValor2(300);
		
		ToString obj1 = new ToString(10);
		obj1.setValor1(20);
		
		ToString obj2 = new ToString(11);
		ToString.setValor2(21);
		

		System.out.println("Valores são " + obj1.getValor1() + " e " + obj1.calcula());
		System.out.println("Valores são " + obj2.getValor1() + " e " + obj2.calcula());
		
		
		System.out.println("Este objeto é: " + obj1);
		System.out.println("Este objeto é: " + obj2);
	}

}
