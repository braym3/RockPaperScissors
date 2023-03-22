package com.qa.rockpaperscissors;

import java.util.Random;

public class Simulator {

	private Random rand = new Random();

	public Result playGame(Shape choice) {
		int randNum = this.rand.nextInt(3);
		Shape cpu;

		// Randomise CPU shape
		if (randNum == 0) {
			cpu = Shape.ROCK;
		} else if (randNum == 1) {
			cpu = Shape.PAPER;
		} else {
			cpu = Shape.SCISSORS;
		}

		System.out.println("YOU: " + choice + " - CPU: " + cpu);
		// Find winner
		return choice.beats(cpu);
	}

}
