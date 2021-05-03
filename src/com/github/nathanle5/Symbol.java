package com.github.nathanle5;

public enum Symbol {

	NONE(""), X("X"), O("O");

	private final String text;

	public String getText() {
		return text;
	}

	private Symbol(String txt) {
		text = txt;
	}

}
