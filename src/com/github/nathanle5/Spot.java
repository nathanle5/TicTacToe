package com.github.nathanle5;

public enum Spot {

	SETTING00(7, 0, 0), SETTING01(8, 0, 1), SETTING02(9, 0, 2), SETTING10(4, 1, 0), SETTING11(5, 1, 1),
	SETTING12(6, 1, 2), SETTING20(1, 2, 0), SETTING21(2, 2, 1), SETTING22(3, 2, 2);

	private final int num;
	private final int row;
	private final int col;

	public int getNumber() {
		return num;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	private Spot(int num, int row, int col) {
		this.num = num;
		this.row = row;
		this.col = col;
	}

}
