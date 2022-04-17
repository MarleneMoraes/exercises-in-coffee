package com.alfamidia.desenvolvedorjava.semana005.aula004;

import java.util.ArrayList;
import java.util.Collections;

public class MetodosArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		//Adiciona o elemento na ordem que aparece
		list.add("cachorro");
		list.add("gato");
		list.add("coelho");
		
		//Adiciona no �ndice indicado o elemento
		list.add(1, "lobo");
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("boi");
		list2.add("bode");
		
		//Adiciona todos os elementos de uma lista a outra
		list.addAll(1, list2);
		
		
		//Imprimir um elemento em espec�fico
		System.out.println(list.get(5));
		
		//Atualizar um elemento em espec�fico
		list.set(5, "coelho do mal");
		
		//Identificar o n�mero do elemento (indexOf)
		System.out.println("O gato � o elemento " + list.indexOf("gato"));
		
		if (list.contains("gato")) System.out.println("Tem um gato na lista.");
		
		//Ordenar uma lista
		Collections.sort(list); 
		
		//Remover um elemento da lista
		list.remove(3);
		
		System.out.println(list);
	}

}
