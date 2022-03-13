package com.skilldistillery.cards.common;

import com.skilldistillery.cards.blackjack.BlackJackHand;

public class Player {

	//Deck deck = new Deck();
	
	private BlackJackHand blackJackHand = new BlackJackHand();
	
	public void recieveCard(Card card){
		blackJackHand.addCard(card);
		
	}
		public String showCards() {
			return blackJackHand.toString();
		}
		public int getHandValue() {
			return blackJackHand.getHandValue();
		}
	
}
	
