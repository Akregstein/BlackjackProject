package com.skilldistillery.cards.blackjack;

import java.util.List;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Hand;

public class BlackJackHand extends Hand {
	Hand hand;
	public BlackJackHand() {

	}

	public int getHandValue() {
		int var = 0;
		for (Card cc : cards) {
			var += cc.getValue();

		}
		return var;
	}

	public boolean isBlackJack() {
		System.out.println();
		System.out.println("BlackJack \n WINNER WINNER CHICKEN DINNER! \n Thank you for playing!");
		return true;
	}
	public boolean dealerBlackJack() {
		System.out.println("BlackJack \n You don't pass go, You dont collect $200 \n Please try again");
		return true;
	}

	public boolean isBust() {
		System.out.println();
		System.out.println("You busted! sorry for your loss \n Try again when you have more money to lose.");
		return true;
	}
	public boolean playerStays() {
		System.out.println("You have chosen to keep current hand");
		return true;
	}




	

}

