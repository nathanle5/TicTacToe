package com.github.nathanle5;

public final class Settings {

	private Mode mode;
	private Difficulty difficulty;
	private Player player1;
	private Player player2;
	private Player[] starting;
	private int currentPlayer;

	public Mode getMode() {
		return mode;
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}

	public Player getPlayer1() {
		return player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public Settings() {
		mode = Mode.PLAYER_VS_COMPUTER;
		difficulty = Difficulty.AIMLESS;
		player1 = Player.getOne();
		player2 = Player.getTwo();
		starting = new Player[] { player1, player2 };
		currentPlayer = 0;
	}

	public String getModeText() {
		return mode.getText();
	}

	public String getDifficultyText() {
		return difficulty.getText();
	}

	public String getPlayer1Text() {
		return player1.getCompetitorText(mode);
	}

	public String getPlayer2Text() {
		return player2.getCompetitorText(mode);
	}

	public String getStartingText() {
		return String.format("%1$s, %2$s", starting[0].getCompetitorText(mode), starting[1].getCompetitorText(mode));
	}

	public String getSymbolText() {
		return String.format("%1$s, %2$s", starting[0].getSymbol(), starting[1].getSymbol());
	}

	public Player getCurrentPlayer() {
		return starting[currentPlayer];
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

	public void changeCurrentPlayer() {
		currentPlayer = (currentPlayer + 1) % 2;
	}

	public void swapMode() {
		mode = mode == Mode.PLAYER_VS_COMPUTER ? Mode.PLAYER_VS_PLAYER : Mode.PLAYER_VS_COMPUTER;
	}

	public void swapSymbols() {
		player1.swapSymbols(player2);
	}

	public void swapStarting() {
		Player temp = starting[0];
		starting[0] = starting[1];
		starting[1] = temp;
	}

	public void resetCurrentPlayer() {
		currentPlayer = 0;
	}

}
