package com.alfamidia.desenvolvedorjava.semana004;

public class Background {
	int[][] map;
	String[] draws;
	Pieces[] enemies;
	int remainingPieces, remainingShot;

	public Background() {
		this.remainingPieces = 5;
		this.remainingShot = 25;
		this.map = new int[10][10];
		this.draws = new String[] { ".", "X", "*" };
		this.enemies = new Pieces[this.remainingPieces];

		for (int i = 0; i < this.remainingPieces; i++)
			this.enemies[i] = new Pieces();
	}

	public void drawLine(int[] line) {
		String lines = "";

		for (int celula : line)
			lines += this.draws[celula] + " ";

		System.out.println(lines);
	}

	public void drawBackground() {
		for (int[] line : this.map)
			this.drawLine(line);

		System.out.println("Peças Restantes: " + this.remainingPieces);
		System.out.println("Tiros Restantes: " + this.remainingShot);
	}

	public boolean shot(int x, int y) {
		this.remainingShot--;
		double distance = 100;
		double d1 = 0;

		for (Pieces p : enemies) {
			if (p.isAlive()) {
				d1 = p.shot(x, y);

				if (d1 == 0) this.remainingPieces--;
				
				if (d1 < distance) distance = d1;

			}
		}

		System.out.println("Distância: " + distance);

		this.map[y][x] = (distance > 0) ? 1 : 2;
		
		return ((this.remainingPieces > 0) && (this.remainingShot>0));
	}
}
