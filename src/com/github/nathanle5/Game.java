package com.github.nathanle5;

public final class Game {

	private Board board;

	public Game(Board board) {
		this.board = board;
	}

	public GameSpot runAI(GameDifficulty gameDifficulty) {
		double rnd;
		int row;
		int col;

		GameDifficulty gd = gameDifficulty;
		if (gameDifficulty == GameDifficulty.RANDOM) {
			rnd = Math.random();
			if (rnd <= 0.2) {
				gd = GameDifficulty.AIMLESS;
			} else if (rnd <= 0.4) {
				gd = GameDifficulty.EASY;
			} else if (rnd <= 0.6) {
				gd = GameDifficulty.NORMAL;
			} else if (rnd <= 0.8) {
				gd = GameDifficulty.HARD;
			} else {
				gd = GameDifficulty.INSANE;
			}
		}

		GameSpot gs = null;
		switch (gd) {
		case AIMLESS:
			do {
				row = (int) (Math.random() * 2);
				col = (int) (Math.random() * 2);
				gs = GameSpot.getSpot(row, col);
			} while (!board.isSpotOpen(gs));
			return gs;
		case EASY:

			return gs;
		case NORMAL:

			return gs;
		case HARD:

			return gs;
		case INSANE:

			return gs;
		default:
			return gs;
		}
	}

}
