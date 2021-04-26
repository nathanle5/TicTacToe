package com.github.nathanle5;

public final class Player {

	private Symbol symbol;
	private Competitor competitor;

	public String getSymbol() {
		return symbol.getText();
	}

	public String getText(Mode mode) {
		return competitor.getText(mode);
	}

	public Player(Symbol symbol, Competitor competitor) {
		this.symbol = symbol;
		this.competitor = competitor;
	}

	public void swapSymbol(Player other) {
		Symbol temp = symbol;
		symbol = other.symbol;
		other.symbol = temp;
	}

}
