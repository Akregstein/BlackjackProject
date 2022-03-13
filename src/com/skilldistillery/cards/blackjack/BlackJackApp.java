package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Dealer;
import com.skilldistillery.cards.common.Player;

public class BlackJackApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Welcome to Wild Dans wildest BlackJack game. \n Yeehaw Cowboys and Cowgals");
		System.out.println();
		BlackJackApp bj = new BlackJackApp();
		bj.run(kb);

	}

	public void run(Scanner kb) {
		Dealer dealer = new Dealer();
		Player player = new Player();
		BlackJackHand hand = new BlackJackHand();

		dealer.shuffle();

		player.recieveCard(dealer.deal());
		dealer.recieveCard(dealer.deal());
		dealer.recieveCard(dealer.deal());
		player.recieveCard(dealer.deal());
//		System.out.println("Dealers Card: " + dealer.showDealerCard());

		System.out.println("Player " + player.showCards());
		System.out.println();

		System.out.println("Dealers hand below ");
//		System.out.println("Dealers Card: " + dealer.showDealerCard());
		System.out.println("Dealer " + dealer.showCards() );

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
			System.out.println("Would you like to hit? \n Enter \"1\" to Hit    or     \"2\" to Stay ");
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
			if (player.getHandValue() > dealer.getHandValue() && player.getHandValue() <= 21) {
				System.out.println();
				System.out.println("You have won the game \n YIPPEE-KAI-YAY");
			}
			if (player.getHandValue() < dealer.getHandValue() && dealer.getHandValue()<= 21){
				System.out.println();
				System.out.println("You LOSE! \n Please see cashier about opening a line of credit.");

			}
			if (player.getHandValue() == dealer.getHandValue()) {
				System.out.println();
				System.out.println("It's a draw \n Lets play again");

			}

		}

	}
}