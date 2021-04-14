package com.github.nathanle5;

public enum GameStart {

	RANDOM("Random", "?"), PLAYER("Player", "P"), COMPUTER("Computer", "C");

	public final String wholeValue;
	public final String shortValue;

	GameStart(String wholeValue, String shortValue) {
		this.wholeValue = wholeValue;
		this.shortValue = shortValue;
	}

}
