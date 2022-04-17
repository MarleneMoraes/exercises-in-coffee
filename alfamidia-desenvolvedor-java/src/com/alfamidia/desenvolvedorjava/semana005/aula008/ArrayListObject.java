package com.alfamidia.desenvolvedorjava.semana005.aula008;

import java.util.ArrayList;

public class ArrayListObject {

	public static void main(String[] args) {
		ArrayList<Objetos> list = new ArrayList<>();
		
		Objetos obj = new ObjetosTriangulares(10,20,100);
		list.add(obj);
		
		obj = new ObjetosSimples(30,40);
		list.add(obj);
		
		obj = new ObjetosSimples(50,60);
		list.add(obj);
		
		obj = new ObjetosTriangulares(100,200,1003);
		list.add(obj);
		
		for(Objetos elemento: list) 
			elemento.exibe();

		
	}

}
