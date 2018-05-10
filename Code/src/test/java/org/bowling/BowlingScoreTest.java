package org.bowling;

import org.approvaltests.Approvals;
import org.junit.Test;

public class BowlingScoreTest {

	@Test
	public void testOwensGame() {
		BowlingGame game = new BowlingGame();
		game.roll(0, 7, 8, 1, 10, 5, 5, 10, 8, 1, 10, 9, 0, 9, 1, 10, 10, 10);
		Approvals.verify(game);
	}

}
