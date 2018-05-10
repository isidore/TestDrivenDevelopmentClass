package org.bowling;

import java.text.MessageFormat;

public class BowlingFrame {
	public int roll1;
	public int roll2;
	public int gameScore;
	public int frameNumber;

	public BowlingFrame(int frameNumber, int previousGameScore) {
		gameScore = previousGameScore;
		this.frameNumber = frameNumber;
	}

	public int getTotalScore() {
		return gameScore + getFrameScore();
	}

	private int getFrameScore() {
		return roll1 + roll2;
	}

	@Override
	public String toString() {
		return MessageFormat.format(" {0} |  {1}  {2}  | {3} | {4} |", frameNumber, roll1, roll2, getFrameScore(),
				getTotalScore());
	}
}