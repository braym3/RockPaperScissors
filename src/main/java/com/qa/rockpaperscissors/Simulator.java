package com.qa.rockpaperscissors;

import java.util.Random;

public class Simulator {

	private Random rand = new Random();

	public Result playGame(Shape choice) {

		// Choose a random Shape for CPU
		// instead of individual if statements for random number - uses the values array
		// of Shape to pick one out by random index
		Shape cpu = Shape.values()[this.rand.nextInt(Shape.values().length)];

		System.out.println("YOU: " + choice + " - CPU: " + cpu);
		// Find winner
		return choice.beats(cpu);
	}

}
