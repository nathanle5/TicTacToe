package com.github.nathanle5;

import java.util.HashMap;
import java.util.Set;

public final class Board {

	public static final int MAX_ROW = 3;
	public static final int MAX_COL = 3;
	public static final int MAX_SIZE = MAX_ROW * MAX_COL;

	private static final String ROW_TOP_KEY = "Top Row";
	private static final String ROW_MIDDLE_KEY = "Middle Row";
	private static final String ROW_BOTTOM_KEY = "Bottom Row";
	private static final String COL_LEFT_KEY = "Left Column";
	private static final String COL_MIDDLE_KEY = "Middle Column";
	private static final String COL_RIGHT_KEY = "Right Column";
	private static final String DIA_LEFT_KEY = "Left Diagonal";
	private static final String DIA_RIGHT_KEY = "Right Diagonal";

	private Settings settings;
	private Statistics pvcStatistics;
	private Statistics pvpStatistics;

	private Player[][] spots;
	private HashMap<String, Spot[]> checkSpots;
	private int turns;

	public Board(Settings settings, Statistics pvcStatistics, Statistics pvpStatistics) {
		this.settings = settings;
		this.pvcStatistics = pvcStatistics;
		this.pvpStatistics = pvpStatistics;

		spots = new Player[MAX_ROW][MAX_COL];
		for (int row = 0; row < MAX_ROW; row++) {
			for (int col = 0; col < MAX_COL; col++) {
				spots[row][col] = Player.getNone();
			}
		}
		checkSpots = new HashMap<>(8);
		checkSpots.put(ROW_TOP_KEY, new Spot[] { Spot.SETTING00, Spot.SETTING01, Spot.SETTING02 });
		checkSpots.put(ROW_MIDDLE_KEY, new Spot[] { Spot.SETTING10, Spot.SETTING11, Spot.SETTING12 });
		checkSpots.put(ROW_BOTTOM_KEY, new Spot[] { Spot.SETTING20, Spot.SETTING21, Spot.SETTING22 });
		checkSpots.put(COL_LEFT_KEY, new Spot[] { Spot.SETTING00, Spot.SETTING10, Spot.SETTING20 });
		checkSpots.put(COL_MIDDLE_KEY, new Spot[] { Spot.SETTING01, Spot.SETTING11, Spot.SETTING21 });
		checkSpots.put(COL_RIGHT_KEY, new Spot[] { Spot.SETTING02, Spot.SETTING12, Spot.SETTING22 });
		checkSpots.put(DIA_LEFT_KEY, new Spot[] { Spot.SETTING00, Spot.SETTING11, Spot.SETTING22 });
		checkSpots.put(DIA_RIGHT_KEY, new Spot[] { Spot.SETTING02, Spot.SETTING11, Spot.SETTING20 });
		turns = MAX_SIZE;
	}

	public Player getPlayerAtSpot(Spot spot) {
		return spots[spot.getRow()][spot.getCol()];
	}

	public void clearSpots() {
		turns = MAX_SIZE;
		for (int row = 0; row < MAX_ROW; row++) {
			for (int col = 0; col < MAX_COL; col++) {
				spots[row][col] = Player.getNone();
			}
		}
		settings.resetCurrentPlayer();
	}

	public boolean isSpotOpen(Spot spot) {
		return getPlayerAtSpot(spot).isBlank();
	}

	public String claimSpot(Spot spot) {
		turns--;
		Player player = settings.getCurrentPlayer();
		spots[spot.getRow()][spot.getCol()] = player;
		settings.changeCurrentPlayer();
		return player.getSymbolText();
	}

	public Outcome checkSpotResults() {
		if (turns <= 0) {
			return Outcome.TIE;
		}
		Set<String> keys = checkSpots.keySet();
		for (String key : keys) {
			Spot[] spots = checkSpots.get(key);
			Player item1 = getPlayerAtSpot(spots[0]);
			Player item2 = getPlayerAtSpot(spots[1]);
			Player item3 = getPlayerAtSpot(spots[2]);
			if (!item1.isBlank() && !item2.isBlank() && !item3.isBlank() && item1.equals(item2) && item1.equals(item3)
					&& item2.equals(item3)) {
				if (item1.getCompetitor().equals(settings.getPlayer1().getCompetitor())) {
					return Outcome.WIN;
				} else {
					return Outcome.LOSS;
				}
			}
		}
		return Outcome.NONE;
	}

	public void runAI() {
		// TODO run ai logic. ensure mode is pvc. change difficulty.
		// TODO if applicable, which is dependent on difficulty, pick random number.
		// TODO if random number, call isSpotOpen(...); if yes, call claimSpot(...).
	}

}
