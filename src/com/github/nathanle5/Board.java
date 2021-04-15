package com.github.nathanle5;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JMenuItem;

public final class Board {

	public static final int MAX_COLS = 3;
	public static final int MAX_ROWS = 3;
	public static final int MAX_SIZE = MAX_COLS * MAX_ROWS;

	private Integer[][] numbers;
	private boolean[][] opens;
	private GameSymbol[][] symbols;
	private GameStart[][] spots;
	private JButton[][] buttons;
	private JMenuItem[][] menus;

	public Board() {
		initialize(null, null);
	}

	public Board(ArrayList<JButton> btns) {
		initialize(btns, null);
	}

	public Board(ArrayList<JButton> btns, ArrayList<JMenuItem> mnms) {
		initialize(btns, mnms);
	}

	private void initialize(ArrayList<JButton> btns, ArrayList<JMenuItem> mnms) {
		numbers = new Integer[MAX_ROWS][MAX_COLS];
		numbers[0][0] = 7;
		numbers[0][1] = 8;
		numbers[0][2] = 9;
		numbers[1][0] = 4;
		numbers[1][1] = 5;
		numbers[1][2] = 6;
		numbers[2][0] = 1;
		numbers[2][1] = 2;
		numbers[2][2] = 3;

		opens = new boolean[MAX_ROWS][MAX_COLS];
		symbols = new GameSymbol[MAX_ROWS][MAX_COLS];
		spots = new GameStart[MAX_ROWS][MAX_COLS];
		for (int row = 0; row < MAX_ROWS; row++) {
			for (int col = 0; col < MAX_COLS; col++) {
				opens[row][col] = true;
				symbols[row][col] = GameSymbol.N;
				spots[row][col] = GameStart.RANDOM;
			}
		}

		if (btns != null && btns.size() == MAX_SIZE) {
			buttons = new JButton[MAX_ROWS][MAX_COLS];
			int row = 0;
			int col = 0;
			for (int size = 0; size < MAX_SIZE; size++) {
				col = size % 3;
				if (col == 0 && size > 0) {
					row++;
				}
				buttons[row][col] = btns.get(size);
			}
		}

		if (mnms != null && mnms.size() == MAX_SIZE) {
			menus = new JMenuItem[MAX_ROWS][MAX_COLS];
			int row = 0;
			int col = 0;
			for (int size = 0; size < MAX_SIZE; size++) {
				col = size % 3;
				if (col == 0 && size > 0) {
					row++;
				}
				menus[row][col] = mnms.get(size);
			}
		}
	}

	public boolean isSpotOpen(GameSpot gameSpot) {
		return opens[gameSpot.row][gameSpot.col];
	}

	public void claimSpot(GameSpot gameSpot, GameSymbol gameSymbol, GameStart gameStart, boolean isShow) { // TODO pass value of isShow into this class; if value changes update value.
		opens[gameSpot.row][gameSpot.col] = false;
		symbols[gameSpot.row][gameSpot.col] = GameSymbol.O; // FIXME hardcoded; need to create a class to hold player one and player two. In GameStart, change to Human One and Human Two etc.
		spots[gameSpot.row][gameSpot.col] = gameStart;
		updateBoard(gameSpot, isShow);
	}

	private void updateBoard(GameSpot gameSpot, boolean isShow) {
		JButton b = buttons[gameSpot.row][gameSpot.col];
		JMenuItem m = menus[gameSpot.row][gameSpot.col];
		b.setEnabled(false);
		b.setText(null);
		if (isShow) {
			b.setText(numbers[gameSpot.row][gameSpot.col] + ": " + symbols[gameSpot.col][gameSpot.col].value);
			m.setText(numbers[gameSpot.row][gameSpot.col] + ": " + symbols[gameSpot.col][gameSpot.col].value);
		} else {
			b.setText(symbols[gameSpot.row][gameSpot.col].value);
			m.setText(symbols[gameSpot.row][gameSpot.col].value);
		}
	}

	public void setEnabled(boolean isEnabled, boolean isShow) {
		JButton tempButton;
		JMenuItem tempMenuItem;
		for (int row = 0; row < MAX_ROWS; row++) {
			for (int col = 0; col < MAX_COLS; col++) {
				tempButton = buttons[row][col];
				tempMenuItem = menus[row][col];
				if (!isEnabled) {
					symbols[row][col] = GameSymbol.N;
					if (isShow) {
						tempButton.setText(numbers[row][col] + ": " + GameSymbol.N.value);
						tempMenuItem.setText(numbers[row][col] + ": " + GameSymbol.N.value);
					} else {
						tempButton.setText(GameSymbol.N.value);
						tempMenuItem.setText(GameSymbol.N.value);
					}
				}
				tempButton.setEnabled(isEnabled);
				tempMenuItem.setEnabled(isEnabled);
			}
		}
	}

	public void updateNumber(boolean isShow) {
		for (int row = 0; row < MAX_ROWS; row++) {
			for (int col = 0; col < MAX_COLS; col++) {
				symbols[row][col] = GameSymbol.N;
				if (isShow) {
					buttons[row][col].setText(numbers[row][col] + ": " + symbols[row][col].value);
					menus[row][col].setText(numbers[row][col] + ": " + symbols[row][col].value);
				} else {
					buttons[row][col].setText(symbols[row][col].value);
					menus[row][col].setText(symbols[row][col].value);
				}
			}
		}
	}

	/*
	private void resetSpotValueText() {
		for (int row = 0; row < MAX_ROW_SPOTS; row++) {
			for (int col = 0; col < MAX_COL_SPOTS - 1; col++) {
				updateSpotValueText(row, col, SYMBOL_U);
			}
		}
	}

	private void updateSpotValueText(int row, int col, char symbol) {
		if (row < 0 || row >= MAX_ROW_SPOTS || col < 0 || col >= MAX_COL_SPOTS) {
			return;
		}
		String text = spotMenuItems[row][col].getText().substring(0, 3) + symbol;
		spotMenuItems[row][col].setText(text);
		spotButtons[row][col].setText(text);
	}

	private boolean isSpotOpen(int row, int col) {
		if (row < 0 || row >= MAX_ROW_SPOTS || col < 0 || col >= MAX_COL_SPOTS) {
			return false;
		}
		return spotSymbols[row][col] == SYMBOL_U;
	}
	 */

}
