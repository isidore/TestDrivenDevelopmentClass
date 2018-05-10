package org.samples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTests {

	@Test
	public void checkNameOfPlayer() {
		Bowling b = new Bowling();
		b.addPlayer("Paul");
		assertEquals("Paul", b.getPlayer(0));
	}

	@Test
	public void checkNameOfDennis() {
		Bowling b = new Bowling();
		b.addPlayer("Dennis");
		assertEquals("Dennis", b.getPlayer(0));
	}

	@Test
	public void checkAllPlayers() {
		Bowling b = new Bowling();
		b.addPlayer("Dennis");
		assertEquals("[Dennis]", b.getAllPlayers().toString());
	}

	@Test
	public void checkMultipleNames() {
		Bowling b = new Bowling();
		b.addPlayer("Dennis");
		b.addPlayer("Paul");
		b.addPlayer("Mary");
		assertEquals("[Dennis, Paul, Mary]", b.getAllPlayers().toString());
	}

	@Test
	public void checkPlayerNumber() {
		Bowling b = new Bowling();
		b.addPlayer("Dennis");
		b.addPlayer("Paul");
		assertEquals("Paul", b.getPlayer(1));
	}

	@Test
	public void testScoreFirstFrame() throws Exception {
		verifySinglePlayer(0, 0, 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNegativeNumbers() {
		verifySinglePlayer(0, -7);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNegative1() {
		verifySinglePlayer(0, -1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalid100() {
		verifySinglePlayer(0, 11);
	}

	// @Test(expected = IllegalArgumentException.class)
	public void testInvalid11() {
		// verifySinglePlayer(0, 5, 6);
	}

	@Test
	public void testScore7() throws Exception {
		verifySinglePlayer(7, 5, 2);
	}

	private void verifySinglePlayer(int expected, int... rolls) {

		Bowling b = new Bowling();
		b.addPlayer("Player1");
		for (int roll : rolls) {
			b.roll(0, roll);

		}
		assertEquals(expected, b.getScoreForPlayer(0));

	}

	@Test
	public void testMultiplePlayers() {

		Bowling b = new Bowling();
		b.addPlayer("Player1");
		b.addPlayer("Player2");
		b.roll(0, 1);
		b.roll(0, 2);
		b.roll(1, 2);
		b.roll(1, 3);
		assertEquals(3, b.getScoreForPlayer(0));
		assertEquals(5, b.getScoreForPlayer(1));

	}
}
