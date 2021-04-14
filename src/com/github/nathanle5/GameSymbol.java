package com.github.nathanle5;

public enum GameSymbol {

	N("?"), X("X"), O("O"), X2("X, O"), O2("O, X");

	public final String value;

	GameSymbol(String value) {
		this.value = value;
	}

}
