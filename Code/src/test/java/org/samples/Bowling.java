package org.samples;

import java.util.ArrayList;
import java.util.List;

public class Bowling {

	private ArrayList<String> names = new ArrayList<>();
	private ArrayList<Integer> scores = new ArrayList<>();

	public void addPlayer(String name) {
		names.add(name);
		scores.add(0);

	}

	public String getPlayer(int i) {
		return names.get(i);
	}

	public List<String> getAllPlayers() {
		return names;
	}

	public void roll(int player, int roll) {
		if (roll < 0 || 10 < roll) {
			throw new IllegalArgumentException();
		}
		scores.set(player, scores.get(player) + roll);
	}

	public int getScoreForPlayer(int player) {
		return scores.get(player);
	}

}
