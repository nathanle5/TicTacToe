package com.github.nathanle5;

public enum Mode {

	PLAYER_VS_COMPUTER("PvC", "Player vs. Computer"), PLAYER_VS_PLAYER("PvP", "Player vs. Player");

	private final String abbreviation;
	private final String text;

	public String getAbbreviation() {
		return abbreviation;
	}

	public String getText() {
		return text;
	}

	private Mode(String abbr, String txt) {
		abbreviation = abbr;
		text = txt;
	}

}
