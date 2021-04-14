package com.github.nathanle5;

public enum GameStart {

	RANDOM("Random", "?"), PLAYER("Player", "P"), COMPUTER("Computer", "C"), PLAYER1("Player 1, Player 2", "P1, P2"),
	PLAYER2("Player 2, Player 1", "P2, P1");

	public final String wholeValue;
	public final String shortValue;

	GameStart(String wholeValue, String shortValue) {
		this.wholeValue = wholeValue;
		this.shortValue = shortValue;
	}

}
