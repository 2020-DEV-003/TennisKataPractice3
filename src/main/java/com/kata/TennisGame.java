package com.kata;

import com.kata.util.Points;
import com.kata.util.Score;

/**
 * @author XXXXX Description : This class contain logic for Tennis Game
 *
 */
public class TennisGame {

	/**
	 * @author XXXXX
	 * @param playerOne
	 * @param playerTwo
	 * @return
	 */
	public String getScore(Player playerOne, Player playerTwo) {
		int playerOneScore = playerOne.getScore();
		int playerTwoScore = playerTwo.getScore();
		if (isAll(playerOneScore, playerTwoScore)) {
			return Points.get(playerOne.getScore()) + Score.ALL.value;
		}
		return Points.get(playerOne.getScore()) + "," + Points.get(playerTwoScore);
	}

	private boolean isAll(int playerOneScore, int playerTwoScore) {
		if (playerOneScore == playerTwoScore && playerOneScore <= 3) {
			return true;
		}
		return false;
	}
}