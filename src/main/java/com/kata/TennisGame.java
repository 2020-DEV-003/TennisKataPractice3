package com.kata;

import com.kata.util.Points;
import com.kata.util.Score;

/**
 * @author XXXXX
 * Description : This class contain logic for Tennis Game
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
		String score = "";
		if (playerOne.getScore() == 0 && playerTwo.getScore() == 0) {
			score = Points.get(playerOne.getScore()) + Score.ALL.value;
		}
		return score;
	}
}