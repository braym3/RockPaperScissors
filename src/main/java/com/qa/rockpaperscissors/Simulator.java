package com.qa.rockpaperscissors;

import java.util.Random;

public class Simulator {

	private Random rand = new Random();

	public boolean playGame(Shape choice) {
		int randNum = this.rand.nextInt(3);
		Shape result;

		// Randomise CPU shape
		if (randNum == 0) {
			result = Shape.ROCK;
		} else if (randNum == 1) {
			result = Shape.PAPER;
		} else {
			result = Shape.SCISSORS;
		}

		System.out.println("YOU: " + choice + " - CPU: " + result);
		// Find winner
		return won(choice, result);
	}

	public boolean won(Shape choice, Shape result) {
		// If choice is rock - wins to scissors, loses to paper
		if (choice == Shape.ROCK)
			return result == Shape.SCISSORS;
		// If choice is paper - wins to rock, loses to scissors
		else if (choice == Shape.PAPER)
			return result == Shape.ROCK;
		// If choice is scissors - wins to paper, loses to rock
		else
			return result == Shape.PAPER;
	}
}
