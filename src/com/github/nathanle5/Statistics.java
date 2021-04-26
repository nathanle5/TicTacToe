package com.github.nathanle5;

public final class Statistics {

	// TODO add history (10 or so previous rounds)
	// TODO will be used in JFrame to display result history

	/**
	 * This is player 1's wins and player 2's losses.
	 */
	private int wins;
	/**
	 * This is player 1's losses and player 1's wins.
	 */
	private int losses;
	/**
	 * This is player 1's and player 2's ties.
	 */
	private int ties;
	/**
	 * This is player 1's and player 2's rounds.
	 */
	private int rounds;

	/**
	 * Constructs an empty statistic class.
	 */
	public Statistics() {
		wins = 0;
		losses = 0;
		ties = 0;
		rounds = 0;
	}

	/**
	 * Adds one win for player 1 (and one loss for player 2). Adds one to round for
	 * both players.
	 */
	public void addWin() {
		wins++;
		rounds++;
	}

	/**
	 * Adds one loss for player 1 (and one win for player 2). Adds one to round for
	 * both players.
	 */
	public void addLoss() {
		losses++;
		rounds++;
	}

	/**
	 * Adds one tie for both player 1 and player 2. Adds one to round for both
	 * players.
	 */
	public void addTie() {
		ties++;
		rounds++;
	}

	/**
	 * Returns player 1's win count as a string.
	 * 
	 * @return a string representation of player 1's win count.
	 * @see #getCount(int)
	 */
	public String getPlayer1WinCount() {
		return getCount(wins);
	}

	/**
	 * Returns player 1's win percent as a string.
	 * 
	 * @return a string representation of player 1's win percent.
	 * @see #getPercent(int)
	 */
	public String getPlayer1WinPercent() {
		return getPercent(wins);
	}

	/**
	 * Returns player 1's loss count as a string.
	 * 
	 * @return a string representation of player 1's loss count.
	 * @see #getCount(int)
	 */
	public String getPlayer1LossCount() {
		return getCount(losses);
	}

	/**
	 * Returns player 1's loss percent as a string.
	 * 
	 * @return a string representation of player 1's loss percent.
	 * @see #getPercent(int)
	 */
	public String getPlayer1LossPercent() {
		return getPercent(losses);
	}

	/**
	 * Returns player 1's tie count as a string.
	 * 
	 * @return a string representation of player 1's tie count.
	 * @see #getCount(int)
	 */
	public String getPlayer1TieCount() {
		return getCount(ties);
	}

	/**
	 * Returns player 1's tie percent as a string.
	 * 
	 * @return a string representation of player 1's tie percent.
	 * @see #getPercent(int)
	 */
	public String getPlayer1TiePercent() {
		return getPercent(ties);
	}

	/**
	 * Returns player 1's round count as a string.
	 * 
	 * @return a string representation of player 1's round count.
	 * @see #getCount(int)
	 */
	public String getPlayer1RoundCount() {
		return getCount(rounds);
	}

	/**
	 * Returns player 2's win count as a string.
	 * 
	 * @return a string representation of player 2's win count.
	 * @see #getCount(int)
	 */
	public String getPlayer2WinCount() {
		return getCount(wins);
	}

	/**
	 * Returns player 2's win percent as a string.
	 * 
	 * @return a string representation of player 2's win percent.
	 * @see #getPercent(int)
	 */
	public String getPlayer2WinPercent() {
		return getPercent(wins);
	}

	/**
	 * Returns player 2's loss count as a string.
	 * 
	 * @return a string representation of player 2's loss count.
	 * @see #getCount(int)
	 */
	public String getPlayer2LossCount() {
		return getCount(losses);
	}

	/**
	 * Returns player 2's loss percent as a string.
	 * 
	 * @return a string representation of player 2's loss percent.
	 * @see #getPercent(int)
	 */
	public String getPlayer2LossPercent() {
		return getPercent(losses);
	}

	/**
	 * Returns player 2's tie count as a string.
	 * 
	 * @return a string representation of player 2's tie count.
	 * @see #getCount(int)
	 */
	public String getPlayer2TieCount() {
		return getCount(ties);
	}

	/**
	 * Returns player 2's tie percent as a string.
	 * 
	 * @return a string representation of player 2's tie percent.
	 * @see #getPercent(int)
	 */
	public String getPlayer2TiePercent() {
		return getPercent(ties);
	}

	/**
	 * Returns player 2's round count as a string.
	 * 
	 * @return a string representation of player 2's round count.
	 * @see #getCount(int)
	 */
	public String getPlayer2RoundCount() {
		return getCount(rounds);
	}

	/**
	 * Returns the current wins, losses, ties, and rounds along with the win
	 * percent, loss percent, and tie percent for both player 1 and player 2.
	 * 
	 * @return a string representation of each value in this class.
	 * @see {@link #getPlayer1WinCount()}, {@link #getPlayer1WinPercent()},
	 *      {@link #getPlayer1LossCount()}, {@link #getPlayer1LossPercent()},
	 *      {@link #getPlayer1TieCount()}, {@link #getPlayer1TiePercent()},
	 *      {@link #getPlayer1RoundCount()},
	 *      {@link #getPlayer2WinCount()}, {@link #getPlayer2WinPercent()},
	 *      {@link #getPlayer2LossCount()}, {@link #getPlayer2LossPercent()},
	 *      {@link #getPlayer2TieCount()}, {@link #getPlayer2TiePercent()},
	 *      {@link #getPlayer2RoundCount()}
	 */
	@Override
	public String toString() {
		String temp = "";
		temp = temp + String.format(
				"PLAYER 1:\nWins = %1$s (%2$s)\nLosses = %3$s (%4$s)\nTies = %5$s (%6$s)\nRounds = %7$s",
				getPlayer1WinCount(), getPlayer1WinPercent(), getPlayer1LossCount(), getPlayer1LossPercent(),
				getPlayer1TieCount(), getPlayer1TiePercent(), getPlayer1RoundCount());
		temp = temp + "\n\n";
		temp = temp + String.format(
				"PLAYER 2:\nWins = %1$s (%2$s)\nLosses = %3$s (%4$s)\nTies = %5$s (%6$s)\nRounds = %7$s",
				getPlayer2WinCount(), getPlayer2WinPercent(), getPlayer2LossCount(), getPlayer2LossPercent(),
				getPlayer2TieCount(), getPlayer2TiePercent(), getPlayer2RoundCount());
		return temp;
	}

	/**
	 * Returns the win, loss, tie, or round count formatted as a string with number
	 * groupings.
	 * 
	 * @param number the win, loss, tie, or round count.
	 * @return a string representation of an {@link Integer} value formatted with
	 *         number groupings. e.g.; 32; 1,024; etc.
	 * @see {@link String#format(String, Object...)}
	 */
	private String getCount(int number) {
		return String.format("%,d", number);
	}

	/**
	 * Returns the win, loss, or tie percent formatted as a string.
	 * 
	 * @param number the win, loss, or tie count.
	 * @return a string representation of an {@link Double} value formatted as a
	 *         percentage. e.g.; 25.00%; 5.28%; etc.
	 * @see {@link String#format(String, Object...)}
	 */
	private String getPercent(int number) {
		double temp = number;
		if (rounds == 0) {
			temp /= 1;
		} else {
			temp /= rounds;
		}
		temp *= 100;
		return String.format("%.2f", temp) + "%";
	}

}
