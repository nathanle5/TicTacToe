package com.github.nathanle5;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.border.TitledBorder;

public final class Board {

	public static final int MAX_ROW = 3;
	public static final int MAX_COL = 3;
	public static final int MAX_SIZE = MAX_ROW * MAX_COL;

	private Settings settings;
	private Statistics pvcStatistics;
	private Statistics pvpStatistics;

	private Integer[][] spotNumbering;
	private Player[][] spotPlayers;
	private JMenuItem[][] spotMenuItems;
	private JButton[][] spotButtons;

	private JMenuItem controlStartMatchMenuItem;
	private JButton controlStartMatchButton;
	private JMenuItem controlEndMatchMenuItem;
	private JButton controlEndMatchButton;
	private JMenuItem controlNewRoundMenuItem;
	private JButton controlNewRoundButton;

	private JLabel settingModeLabel;
	private JLabel settingDifficultyLabel;
	private JLabel settingStartingLabel;
	private JLabel settingSymobolLabel;

	private TitledBorder statisticData1Border;
	private TitledBorder statisticData2Border;

	private JLabel statisticData1WinLabel;
	private JLabel statisticData1WinPercentLabel;
	private JLabel statisticData1LossLabel;
	private JLabel statisticData1LossPercentLabel;
	private JLabel statisticData1TieLabel;
	private JLabel statisticData1TiePercentLabel;
	private JLabel statisticData1RoundLabel;

	private JLabel statisticData2WinLabel;
	private JLabel statisticData2WinPercentLabel;
	private JLabel statisticData2LossLabel;
	private JLabel statisticData2LossPercentLabel;
	private JLabel statisticData2TieLabel;
	private JLabel statisticData2TiePercentLabel;
	private JLabel statisticData2RoundLabel;

	public Settings getSettings() {
		return settings;
	}

	public Statistics getPvcStatistics() {
		return pvcStatistics;
	}

	public Statistics getPvpStatistics() {
		return pvpStatistics;
	}

	public Board() {
		settings = new Settings();
		pvcStatistics = new Statistics();
		pvpStatistics = new Statistics();

		spotNumbering = new Integer[MAX_ROW][MAX_COL];
		spotNumbering[0][0] = 7;
		spotNumbering[0][1] = 8;
		spotNumbering[0][2] = 9;
		spotNumbering[1][0] = 4;
		spotNumbering[1][1] = 5;
		spotNumbering[1][2] = 6;
		spotNumbering[2][0] = 1;
		spotNumbering[2][1] = 2;
		spotNumbering[2][2] = 3;
		spotPlayers = new Player[MAX_ROW][MAX_COL];
		spotMenuItems = new JMenuItem[MAX_ROW][MAX_COL];
		spotButtons = new JButton[MAX_ROW][MAX_COL];
	}

	public void populateSpotMenuItems(JMenuItem menuItemSpot00, JMenuItem menuItemSpot01, JMenuItem menuItemSpot02,
			JMenuItem menuItemSpot10, JMenuItem menuItemSpot11, JMenuItem menuItemSpot12, JMenuItem menuItemSpot20,
			JMenuItem menuItemSpot21, JMenuItem menuItemSpot22) {
		spotMenuItems[0][0] = menuItemSpot00;
		spotMenuItems[0][1] = menuItemSpot01;
		spotMenuItems[0][2] = menuItemSpot02;
		spotMenuItems[1][0] = menuItemSpot10;
		spotMenuItems[1][1] = menuItemSpot11;
		spotMenuItems[1][2] = menuItemSpot12;
		spotMenuItems[2][0] = menuItemSpot20;
		spotMenuItems[2][1] = menuItemSpot21;
		spotMenuItems[2][2] = menuItemSpot22;
	}

	public void populateSpotButtons(JButton buttonSpot00, JButton buttonSpot01, JButton buttonSpot02,
			JButton buttonSpot10, JButton buttonSpot11, JButton buttonSpot12, JButton buttonSpot20,
			JButton buttonSpot21, JButton buttonSpot22) {
		spotButtons[0][0] = buttonSpot00;
		spotButtons[0][1] = buttonSpot01;
		spotButtons[0][2] = buttonSpot02;
		spotButtons[1][0] = buttonSpot10;
		spotButtons[1][1] = buttonSpot11;
		spotButtons[1][2] = buttonSpot12;
		spotButtons[2][0] = buttonSpot20;
		spotButtons[2][1] = buttonSpot21;
		spotButtons[2][2] = buttonSpot22;
	}

	public void populateControlMenuItems(JMenuItem menuItemGameStartMatch, JMenuItem menuItemGameEndMatch,
			JMenuItem menuItemGameNewRound) {
		controlStartMatchMenuItem = menuItemGameStartMatch;
		controlEndMatchMenuItem = menuItemGameEndMatch;
		controlNewRoundMenuItem = menuItemGameNewRound;
	}

	public void populateControlButtons(JButton buttonGameStartMatch, JButton buttonGameEndMatch,
			JButton buttonGameNewRound) {
		controlStartMatchButton = buttonGameStartMatch;
		controlEndMatchButton = buttonGameEndMatch;
		controlNewRoundButton = buttonGameNewRound;
	}

	public void populateSettingLabels(JLabel labelSettingMode, JLabel labelSettingDifficulty,
			JLabel labelSettingStarting, JLabel labelSettingSymbol, TitledBorder borderStatisticData1,
			TitledBorder borderStatisticsData2) {
		settingModeLabel = labelSettingMode;
		settingDifficultyLabel = labelSettingDifficulty;
		settingStartingLabel = labelSettingStarting;
		settingSymobolLabel = labelSettingSymbol;
		statisticData1Border = borderStatisticData1;
		statisticData2Border = borderStatisticsData2;
	}

	public void populateStatisticLabels(JLabel labelStatisticData1Win, JLabel labelStatisticData1WinPercent,
			JLabel labelStatisticData1Loss, JLabel labelStatisticData1LossPercent, JLabel labelStatisticData1Tie,
			JLabel labelStatisticData1TiePercent, JLabel labelStatisticData1Round, JLabel labelStatisticData2Win,
			JLabel labelStatisticData2WinPercent, JLabel labelStatisticData2Loss, JLabel labelStatisticData2LossPercent,
			JLabel labelStatisticData2Tie, JLabel labelStatisticData2TiePercent, JLabel labelStatisticData2Round) {
		statisticData1WinLabel = labelStatisticData1Win;
		statisticData1WinPercentLabel = labelStatisticData1WinPercent;
		statisticData1LossLabel = labelStatisticData1Loss;
		statisticData1LossPercentLabel = labelStatisticData1LossPercent;
		statisticData1TieLabel = labelStatisticData1Tie;
		statisticData1TiePercentLabel = labelStatisticData1TiePercent;
		statisticData1RoundLabel = labelStatisticData1Round;
		statisticData2WinLabel = labelStatisticData2Win;
		statisticData2WinPercentLabel = labelStatisticData2WinPercent;
		statisticData2LossLabel = labelStatisticData2Loss;
		statisticData2LossPercentLabel = labelStatisticData2LossPercent;
		statisticData2TieLabel = labelStatisticData2Tie;
		statisticData2TiePercentLabel = labelStatisticData2TiePercent;
		statisticData2RoundLabel = labelStatisticData2Round;
	}

	public void updateSpotText() {
		for (int row = 0; row < MAX_ROW; row++) {
			for (int col = 0; col < MAX_COL; col++) {
				if (spotPlayers[row][col] == null) {
					spotMenuItems[row][col].setText(spotNumbering[row][col] + ":");
					spotButtons[row][col].setText("");
				} else {
					spotMenuItems[row][col].setText(spotNumbering[row][col] + ":" + spotPlayers[row][col].getSymbol());
					spotButtons[row][col].setText(spotPlayers[row][col].getSymbol());
				}
			}
		}
	}

	public void updateSettingText() {
		settingModeLabel.setText(getSettings().getModeText());
		settingDifficultyLabel.setText(getSettings().getDifficultyText());
		settingStartingLabel.setText(getSettings().getStartingText());
		settingSymobolLabel.setText(getSettings().getSymbolText());
		statisticData1Border.setTitle(getSettings().getPlayer1Text() + ":");
		statisticData2Border.setTitle(getSettings().getPlayer2Text() + ":");
	}

	public void updateStatisticText() {
		Statistics statistics = getSettings().getMode() == Mode.PLAYER_VS_COMPUTER ? pvcStatistics : pvpStatistics;
		statisticData1WinLabel.setText(statistics.getPlayer1WinCount());
		statisticData1WinPercentLabel.setText(statistics.getPlayer1WinPercent());
		statisticData1LossLabel.setText(statistics.getPlayer1LossCount());
		statisticData1LossPercentLabel.setText(statistics.getPlayer1LossPercent());
		statisticData1TieLabel.setText(statistics.getPlayer1TieCount());
		statisticData1TiePercentLabel.setText(statistics.getPlayer1TiePercent());
		statisticData1RoundLabel.setText(statistics.getPlayer1RoundCount());
		statisticData2WinLabel.setText(statistics.getPlayer2WinCount());
		statisticData2WinPercentLabel.setText(statistics.getPlayer2WinPercent());
		statisticData2LossLabel.setText(statistics.getPlayer2LossCount());
		statisticData2LossPercentLabel.setText(statistics.getPlayer2LossPercent());
		statisticData2TieLabel.setText(statistics.getPlayer2TieCount());
		statisticData2TiePercentLabel.setText(statistics.getPlayer2TiePercent());
		statisticData2RoundLabel.setText(statistics.getPlayer2RoundCount());
	}

	public void gameStartMatch() {
		controlEndMatchButton.setEnabled(true);
		controlEndMatchMenuItem.setEnabled(true);
		controlNewRoundButton.setEnabled(true);
		controlNewRoundMenuItem.setEnabled(true);
		controlStartMatchButton.setEnabled(false);
		controlStartMatchMenuItem.setEnabled(false);
		for (int row = 0; row < MAX_ROW; row++) {
			for (int col = 0; col < MAX_COL; col++) {
				spotMenuItems[row][col].setEnabled(true);
				spotButtons[row][col].setEnabled(true);
			}
		}
	}

	public void gameEndMatch() {
		for (int row = 0; row < MAX_ROW; row++) {
			for (int col = 0; col < MAX_COL; col++) {
				spotPlayers[row][col] = null;
				spotMenuItems[row][col].setEnabled(false);
				spotButtons[row][col].setEnabled(false);
			}
		}
		updateSpotText();
		controlStartMatchButton.setEnabled(true);
		controlStartMatchMenuItem.setEnabled(true);
		controlEndMatchButton.setEnabled(false);
		controlEndMatchMenuItem.setEnabled(false);
		controlNewRoundButton.setEnabled(false);
		controlNewRoundMenuItem.setEnabled(false);
	}

	public void gameNewRound() {
		for (int row = 0; row < MAX_ROW; row++) {
			for (int col = 0; col < MAX_COL; col++) {
				spotPlayers[row][col] = null;
				spotMenuItems[row][col].setEnabled(true);
				spotButtons[row][col].setEnabled(true);
			}
		}
		updateSpotText();
		getSettings().resetCurrentPlayer();
	}

	public void gameSpotClaim(int row, int col) {
		spotPlayers[row][col] = getSettings().getCurrentPlayer();
		spotMenuItems[row][col].setEnabled(false);
		spotButtons[row][col].setEnabled(false);
		updateSpotText(); // TODO change this so it only updates that button instead of all of them.
		getSettings().changeCurrentPlayer();
	}

}
