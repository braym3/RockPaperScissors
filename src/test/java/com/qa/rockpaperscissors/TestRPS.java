package com.qa.rockpaperscissors;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestRPS {

	// Create a mock random object
	@Mock
	private Random rand;

	// Insert mock into simulator
	@InjectMocks
	private Simulator sim;

	@Test
	void testRockWin() {
		// Make CPU 'choose' scissors
		Mockito.when(this.rand.nextInt(3)).thenReturn(2);
		// Test 10 times
		for (int i = 0; i < 10; i++) {
			assertEquals(Result.WIN, this.sim.playGame(Shape.ROCK));
		}

		// Check that the mock is being used 10 times
		Mockito.verify(this.rand, Mockito.times(10)).nextInt(3);
	}

	@Test
	void testRockLose() {
		// Make CPU 'choose' paper
		Mockito.when(this.rand.nextInt(3)).thenReturn(1);
		// Test 10 times
		for (int i = 0; i < 10; i++) {
			assertEquals(Result.LOSE, this.sim.playGame(Shape.ROCK));
		}

		// Check that the mock is being used 10 times
		Mockito.verify(this.rand, Mockito.times(10)).nextInt(3);
	}

	@Test
	void testRockTie() {
		// Make CPU 'choose' rock
		Mockito.when(this.rand.nextInt(3)).thenReturn(0);
		// Test 10 times
		for (int i = 0; i < 10; i++) {
			assertEquals(Result.TIE, this.sim.playGame(Shape.ROCK));
		}

		// Check that the mock is being used 10 times
		Mockito.verify(this.rand, Mockito.times(10)).nextInt(3);
	}

	@Test
	void testPaperWin() {
		// Make CPU 'choose' rock
		Mockito.when(this.rand.nextInt(3)).thenReturn(0);
		// Test 10 times
		for (int i = 0; i < 10; i++) {
			assertEquals(Result.WIN, this.sim.playGame(Shape.PAPER));
		}

		// Check that the mock is being used 10 times
		Mockito.verify(this.rand, Mockito.times(10)).nextInt(3);
	}

	@Test
	void testPaperLose() {
		// Make CPU 'choose' scissors
		Mockito.when(this.rand.nextInt(3)).thenReturn(2);
		// Test 10 times
		for (int i = 0; i < 10; i++) {
			assertEquals(Result.LOSE, this.sim.playGame(Shape.PAPER));
		}

		// Check that the mock is being used 10 times
		Mockito.verify(this.rand, Mockito.times(10)).nextInt(3);
	}

	@Test
	void testPaperTie() {
		// Make CPU 'choose' paper
		Mockito.when(this.rand.nextInt(3)).thenReturn(1);
		// Test 10 times
		for (int i = 0; i < 10; i++) {
			assertEquals(Result.TIE, this.sim.playGame(Shape.PAPER));
		}

		// Check that the mock is being used 10 times
		Mockito.verify(this.rand, Mockito.times(10)).nextInt(3);
	}

	@Test
	void testScissorsWin() {
		// Make CPU 'choose' paper
		Mockito.when(this.rand.nextInt(3)).thenReturn(1);
		// Test 10 times
		for (int i = 0; i < 10; i++) {
			assertEquals(Result.WIN, this.sim.playGame(Shape.SCISSORS));
		}

		// Check that the mock is being used 10 times
		Mockito.verify(this.rand, Mockito.times(10)).nextInt(3);
	}

	@Test
	void testScissorsLose() {
		// Make CPU 'choose' rock
		Mockito.when(this.rand.nextInt(3)).thenReturn(0);
		// Test 10 times
		for (int i = 0; i < 10; i++) {
			assertEquals(Result.LOSE, this.sim.playGame(Shape.SCISSORS));
		}

		// Check that the mock is being used 10 times
		Mockito.verify(this.rand, Mockito.times(10)).nextInt(3);
	}

	@Test
	void testScissorsTie() {
		// Make CPU 'choose' scissors
		Mockito.when(this.rand.nextInt(3)).thenReturn(2);
		// Test 10 times
		for (int i = 0; i < 10; i++) {
			assertEquals(Result.TIE, this.sim.playGame(Shape.SCISSORS));
		}

		// Check that the mock is being used 10 times
		Mockito.verify(this.rand, Mockito.times(10)).nextInt(3);
	}
}
