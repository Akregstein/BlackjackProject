package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

import com.skilldistillery.cards.common.Dealer;
import com.skilldistillery.cards.common.Player;

public class BlackJackApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		BlackJackApp bj = new BlackJackApp();
		bj.run(kb);

	}

	public void run(Scanner kb) {


		PlayerLoop play = new PlayerLoop();
		play.playerLoop();


	}

}
