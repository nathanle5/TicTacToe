package com.github.nathanle5;

public final class Settings {

	private Mode mode;
	private Difficulty difficulty;
	private Player player1;
	private Player player2;
	private Player[] starting;

	public Mode getMode() {
		return mode;
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}

	public Settings() {
		mode = Mode.PLAYER_VS_COMPUTER;
		difficulty = Difficulty.AIMLESS;
		player1 = new Player(Symbol.X, Competitor.PLAYER1);
		player2 = new Player(Symbol.O, Competitor.PLAYER2);
		starting = new Player[] { player1, player2 };
	}

	public String getModeText() {
		return mode.getText();
	}

	public String getDifficultyText() {
		return difficulty.getText();
	}

	public String getPlayer1Text() {
		return player1.getText(mode);
	}

	public String getPlayer2Text() {
		return player2.getText(mode);
	}

	public String getStartingText() {
		return String.format("%1$s, %2$s", starting[0].getText(mode), starting[1].getText(mode));
	}

	public String getSymbolText() {
		return String.format("%1$s, %2$s", starting[0].getSymbol(), starting[1].getSymbol());
	}

	public boolean changeDifficulty(String text) {
		boolean found = false;
		for (Difficulty difficulty : Difficulty.values()) {
			if (difficulty.getText() == text) {
				this.difficulty = difficulty;
				found = true;
			}
		}
		return found;
	}

	public void swapMode() {
		mode = mode == Mode.PLAYER_VS_COMPUTER ? Mode.PLAYER_VS_PLAYER : Mode.PLAYER_VS_COMPUTER;
	}

	public void swapSymbol() {
		player1.swapSymbol(player2);
	}

	public void swapStarting() {
		Player temp = starting[0];
		starting[0] = starting[1];
		starting[1] = temp;
	}

}
