package com.kata.test;

import org.junit.Before;

import com.kata.Player;
import com.kata.TennisGame;

public class TennisGameTest {

	Player playerOne;

	Player playerTwo;

	TennisGame tennisGame;

	@Before
	public void beforeTennisGameTest() {
		playerOne = new Player();
		playerTwo = new Player();
		playerOne.setName("Dhileepan");
		playerTwo.setName("Suresh");
		tennisGame = new TennisGame();
	}

}