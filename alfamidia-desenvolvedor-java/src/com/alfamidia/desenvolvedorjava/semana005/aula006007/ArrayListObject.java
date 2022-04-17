package com.alfamidia.desenvolvedorjava.semana005.aula006007;

import java.util.ArrayList;

public class ArrayListObject {

	public static void main(String[] args) {
		ArrayList<Objetos> list = new ArrayList<>();
		
		Objetos obj = new ObjetosTriangulares(10,20,100);
		list.add(obj);
		
		obj = new Objetos(30,40);
		list.add(obj);
		
		obj = new Objetos(50,60);
		list.add(obj);
		
		obj = new ObjetosTriangulares(100,200,1003);
		list.add(obj);
		
		for(Objetos elemento: list) 
			elemento.exibe();

		
	}

}
