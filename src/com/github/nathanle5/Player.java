package com.github.nathanle5;

public final class Player {

	private Symbol symbol;
	private Competitor competitor;

	public static void swapSymbols(Player left, Player right) {
		if (left.symbol == Symbol.NONE || right.symbol == Symbol.NONE) {
			return;
		}
		Symbol temp = left.symbol;
		left.symbol = right.symbol;
		right.symbol = temp;
	}

	/**
	 * Initializes a new {@link Player} class that contains {@link Symbol#NONE no
	 * symbol} and {@link Competitor#NONE no competitor}.
	 * 
	 * @return a new {@link Player} class.
	 */
	public static Player getNone() {
		return new Player(Symbol.NONE, Competitor.NONE);
	}

	/**
	 * Initializes a new {@link Player} class with an {@link Symbol#X X symbol} for
	 * {@link Competitor#PLAYER1 competitor 1}.
	 * 
	 * @return a new {@link Player} class.
	 */
	public static Player getOne() {
		return new Player(Symbol.X, Competitor.PLAYER1);
	}

	/**
	 * Initializes a new {@link Player} class with an {@link Symbol#O O symbol} for
	 * {@link Competitor#PLAYER2 competitor 2}.
	 * 
	 * @return a new {@link Player} class.
	 */
	public static Player getTwo() {
		return new Player(Symbol.O, Competitor.PLAYER2);
	}

	public Symbol getSymbol() {
		return symbol;
	}

	public Competitor getCompetitor() {
		return competitor;
	}

	private Player(Symbol symbol, Competitor competitor) {
		this.symbol = symbol;
		this.competitor = competitor;
	}

	public String getSymbolText() {
		return symbol.getText();
	}
	
	public String getCompetitorText(Mode mode) {
		return competitor.getText(mode);
	}

	public void swapSymbols(Player other) {
		swapSymbols(this, other);
	}

	@Override
	public boolean equals(Object other) {
		if (other == null) {
			return false;
		}
		if (other instanceof Player) {
			return equals((Player) other);
		}
		return super.equals(other);
	}

	public boolean equals(Player other) {
		if (other == null) {
			return false;
		}
		return symbol == other.symbol && competitor == other.competitor;
	}

	public boolean isBlank() {
		Player skip = Player.getNone();
		return skip.equals(this);
	}

}
