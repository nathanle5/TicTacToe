package com.github.nathanle5;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JMenuItem;

public final class Board {

	public static final int MAX_COLS = 3;
	public static final int MAX_ROWS = 3;
	public static final int MAX_SIZE = MAX_COLS * MAX_ROWS;

	private GameSymbol[][] symbols;
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
		symbols = new GameSymbol[MAX_ROWS][MAX_COLS];
		for (int row = 0; row < MAX_ROWS; row++) {
			for (int col = 0; col < MAX_COLS; col++) {
				symbols[row][col] = GameSymbol.N;
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
