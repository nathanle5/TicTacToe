package com.github.nathanle5;

public enum GameDifficulty {

	RANDOM("Random", "?", 0.0), AIMLESS("Aimless", "!", 1.00), EASY("Easy", "!!", 0.75), NORMAL("Normal", "!!!", 0.50),
	HARD("Hard", "!!!!", 0.25), INSANE("Insane", "!!!!!", 0.0);

	public final String wholeValue;
	public final String shortValue;
	public final double randomModifier;

	GameDifficulty(String wholeValue, String shortValue, double randomModifier) {
		this.wholeValue = wholeValue;
		this.shortValue = shortValue;
		this.randomModifier = randomModifier;
	}

}
