package com.alfamidia.desenvolvedorjava.semana003.aula001;

import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		ValoresEstaticos.setValor2(300);
		
		ValoresEstaticos obj1 = new ValoresEstaticos(10);
		obj1.setValor1(20);
		
		System.out.println("Valores são " + obj1.getValor1() + " e " + obj1.calcula());
		
		ValoresEstaticos obj2 = new ValoresEstaticos(11);
		obj2.setValor1(21);

		
		System.out.println("Valores são " + obj2.getValor1() + " e " + obj2.calcula());

	}

}
