package com.github.nathanle5;

public enum Difficulty {

	AIMLESS("Aimless", true, 1.00), EASY("Easy", true, 0.75), NORMAL("Normal", true, 0.50), HARD("Hard", true, 0.25),
	INSANE("Insane", false, 0.00);

	private final String text;
	private final boolean randomable;
	private final double difficulty;

	public String getText() {
		return text;
	}

	private Difficulty(String txt, boolean rnd, double diff) {
		text = txt;
		randomable = rnd;
		difficulty = diff;
	}

	/**
	 * Determines whether or not the currently selected difficulty level can pick a
	 * random spot.
	 * 
	 * @return
	 */
	public boolean doRandom() {
		if (!randomable) {
			return false;
		}
		double rnd = Math.random();
		return rnd <= difficulty;
	}

}
