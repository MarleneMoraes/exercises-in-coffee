package com.alfamidia.desenvolvedorjava.semana003.aula004;

import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Objetos[] objetoArray = new Objetos[4];
		objetoArray[0] = new Objetos(10,20);
		objetoArray[1] = new Objetos(20,30);
		objetoArray[2] = new Objetos(40,50);
		objetoArray[3] = new Objetos(50,60);
		
		for (Objetos objeto: objetoArray)
			System.out.println(objeto);
	}
	
	
}
