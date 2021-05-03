package com.github.nathanle5;

public enum Competitor {

	NONE("", ""), PLAYER1("Player", "Player 1"), PLAYER2("Computer", "Player 2");

	private final String text1;
	private final String text2;

	public String getText(Mode mode) {
		switch (mode) {
		case PLAYER_VS_PLAYER:
			return text2;
		default:
			return text1;
		}
	}

	private Competitor(String txt1, String txt2) {
		text1 = txt1;
		text2 = txt2;
	}

}
