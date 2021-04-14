package com.github.nathanle5;

public enum GameMode {

	PLAYER_VS_COMPUTER("Player vs. Computer", "PvC"), PLAYER_VS_PLAYER("Player vs. Player", "PvP");

	public final String wholeValue;
	public final String shortValue;

	GameMode(String wholeValue, String shortValue) {
		this.wholeValue = wholeValue;
		this.shortValue = shortValue;
	}

}
