package com.qa.rockpaperscissors;

public class Runner {

	public static void main(String[] args) {
		Simulator sim = new Simulator();
		for (int i = 0; i < 10; i++) {
			System.out.println(sim.playGame(Shape.SCISSORS));
		}

	}

}
