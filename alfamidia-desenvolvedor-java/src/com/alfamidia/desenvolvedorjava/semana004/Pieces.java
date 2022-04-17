package com.alfamidia.desenvolvedorjava.semana004;

import java.util.Random;

public class Pieces {
	int x;
	int y;
	private boolean alive;

	public Pieces() {
		Random rand = new Random();
		this.x = rand.nextInt(10);
		this.y = rand.nextInt(10);
		this.alive = true;
	}

	public boolean isAlive() {
		return alive;
	};

	public double shot(int x, int y) {
		double distance = Math.sqrt((x - this.x) * x - this.x + (y - this.y) * (y - this.y));
		if (distance == 0)
			this.alive = false;
		return distance;
	}
}
