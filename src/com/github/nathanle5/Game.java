package com.github.nathanle5;

public final class Game {

	private Board board;
	private GameMode gameMode;
	private GameSymbol gameSymbol;
	private GameStart gameStart;
	private GameDifficulty gameDifficulty;

	public Game(Board board, GameMode gameMode, GameSymbol gameSymbol, GameStart gameStart,
			GameDifficulty gameDifficulty) {
		this.board = board;
		this.gameMode = gameMode;
		this.gameSymbol = gameSymbol;
		this.gameStart = gameStart;
		this.gameDifficulty = gameDifficulty;
	}

}
