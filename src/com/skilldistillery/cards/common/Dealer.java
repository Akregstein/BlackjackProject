package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.blackjack.BlackJackHand;

public class Dealer extends Player{
	

	private BlackJackHand blackJackHand = new BlackJackHand();
	private Deck deck= new Deck();
//	private Hand hand = new Hand();
	
	public Card deal() {
	return	deck.dealCard();
	}
	
	public Card showDealerCard() {
		
		return deck.showDealerCard();
	}
	public Card showDealerCard2() {
		
		return deck.showDealerCard2();
	}
	
public void hit() {
	System.out.println("You have chosen to hit: \n Recieving next card.");
	System.out.println();
	
}

	public void shuffle() {
		deck.shuffle();
	}
	public void dealersTurn() {
		System.out.println();
		System.out.println(" \t Dealers turn");
		System.out.println();
	//	System.out.println(showDealerCard() +" " + showDealerCard2());
		
	//	System.out.println("Dealer " +showCards());
	//	System.out.println("Flipping Dealers next Card");
//		recieveCard(deal());
		
		while (getHandValue()<= 21) {
			if(getHandValue()<17) {
				System.out.println();
				System.out.println("Less than 17, Dealer must hit! \n recieving next card");
				System.out.println();
				shuffle();
				recieveCard(deal());
				System.out.println("Dealer " +showCards());
			}
			if (getHandValue()==21) {
				System.out.println("Dealer has hit a BlackJack");
				break;
			}
				if (getHandValue()>21) {
					System.out.println("Dealer Busts \n Go buy your lover something Shiny");
					break;
			}
			if(getHandValue()>= 17 && getHandValue()< 22) {
				System.out.println("Dealer chooses to stay");
				break;
			}
				
		}
	}

	}

	

