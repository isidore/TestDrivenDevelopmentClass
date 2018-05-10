package org.bowling;

import java.util.ArrayList;
import java.util.List;

import com.spun.util.ArrayUtils;

public class BowlingGame {

	List<BowlingFrame> frames = new ArrayList<BowlingFrame>();

	public void roll(int... rolls) {
		BowlingFrame frame = new BowlingFrame(1, 0);

		frame.roll1 = rolls[0];
		frame.roll2 = rolls[1];
		frames.add(frame);
		BowlingFrame frame2 = new BowlingFrame(2, frame.getTotalScore());

		frame2.roll1 = rolls[2];
		frame2.roll2 = rolls[3];
		frames.add(frame2);
	}

	@Override
	public String toString() {
		return ArrayUtils.toString(frames, f -> f.toString());
	}

}
