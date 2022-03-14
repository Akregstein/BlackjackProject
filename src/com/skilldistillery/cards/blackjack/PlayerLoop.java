package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

import com.skilldistillery.cards.common.Dealer;
import com.skilldistillery.cards.common.Player;

public class PlayerLoop {
	Scanner kb = new Scanner(System.in);
	Dealer dealer = new Dealer();
	Player player = new Player();
	BlackJackHand hand = new BlackJackHand();

	public void playerLoop() {
		System.out.println("Welcome to Wild Dans wildest BlackJack game. \n ***Yeehaw Cowboys and Cowgals***");
		System.out.println();
		dealer.shuffle();
		System.out.println("First round of cards are being dealt");
		System.out.println();
		dealer.recieveCard(dealer.deal());
		dealer.recieveCard(dealer.deal());
		player.recieveCard(dealer.deal());
		player.recieveCard(dealer.deal());

		System.out.println("Player " + player.showCards());
		System.out.println();

//		System.out.println("Dealers hand below ");
		System.out.println("Dealer " + dealer.showCards());
		// System.out.println("Dealers Card: " + dealer.showDealerCard());
//	System.out.println("Dealers Card: Hidden");
//	System.out.println("Dealer " + dealer.showCards() );

		while (player.getHandValue() <= 21) {

			if (player.getHandValue() == 21) {
				hand.isBlackJack();
				break;
			}
			if (dealer.getHandValue() == 21) {
				hand.dealerBlackJack();
				break;
			}
			System.out.println();
			System.out.println("\t Would you like to hit? \n ** Enter \"1\" to Hit **    or    ** Enter \"2\" to Stay ** ");
			int hitter = kb.nextInt();

			if (hitter == 1) {
				dealer.hit();
				player.recieveCard(dealer.deal());
				System.out.println("Player " + player.showCards());

			}
			if (hitter == 2) {
				hand.playerStays();
				break;
			}

			if (player.getHandValue() > 21) {
				hand.isBust();
				break;
			}

		}
		if (player.getHandValue() < 21 && dealer.getHandValue() < 21) {
			dealer.dealersTurn();
		}
		if (player.getHandValue() > dealer.getHandValue() && player.getHandValue() <= 21) {
			System.out.println();
			System.out.println("You have won the game \n YIPPEE-KAI-YAY");
		}
		if (player.getHandValue() < dealer.getHandValue() && dealer.getHandValue() <= 21) {
			System.out.println();
			System.out.println("You LOSE! \n Please see cashier about opening a line of credit.");

		}
		if (player.getHandValue() == dealer.getHandValue()) {
			System.out.println();
			System.out.println("It's a draw \n Lets play again");

		}
	}
}