package com.alfamidia.desenvolvedorjava.semana004;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Background mapa = new Background();
		boolean continuarPartida = true;
		String posicao;
		
		
		
		while(continuarPartida) {
			System.out.println("Posição x e y [x,y]: ");
			posicao = scan.nextLine();
			String[] numeros = posicao.split(",");
					
			int x = Integer.parseInt(numeros[0]);
			int y = Integer.parseInt(numeros[1]);
			
			
			if(posicao.equals("FIM")) break;
			continuarPartida = mapa.shot(x,y);
			mapa.drawBackground();
		}
		
		
		scan.close();
	}

}
