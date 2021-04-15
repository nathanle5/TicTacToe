package com.github.nathanle5;

public enum GameSpot {
	SPOT00(0, 0), SPOT01(0, 1), SPOT02(0, 2), SPOT10(1, 0), SPOT11(1, 1), SPOT12(1, 2), SPOT20(2, 0), SPOT21(2, 1),
	SPOT22(2, 2);

	public final int row;
	public final int col;

	GameSpot(int row, int col) {
		this.row = row;
		this.col = col;
	}

	/**
	 * Find the spot based off a row and column value.
	 * 
	 * @param row The spot's row.
	 * @param col The spot's column.
	 * @return The board's spot; otherwise, null.
	 */
	public static GameSpot getSpot(int row, int col) {
		if (row < 0) {
			row = 0;
		} else if (row > 2) {
			row = 2;
		}
		if (col < 0) {
			col = 0;
		} else if (col > 2) {
			col = 2;
		}
		for (GameSpot gs : GameSpot.values()) {
			if (gs.row == row && gs.col == col) {
				return gs;
			}
		}
		return null;
	}
}
