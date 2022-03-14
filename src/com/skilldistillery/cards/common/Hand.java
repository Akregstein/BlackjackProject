package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
Deck deck= new Deck();
	 protected List<Card> cards = new ArrayList<>(52);



	public Hand() {
		super();
	//	this.cards = new ArrayList<>();
	}

	public void addCard(Card card) {
		this.cards.add(card);

	}

	public void clear() {

	}

	public abstract int getHandValue();

	
	
//	public Card showDealerCard() {
//		int size = cards.size();
//		return cards.get(0) ;
//		size -1;
		
//	}

	@Override
	public String toString() {
		return " hand: " + cards + " * Total hand value: " + getHandValue()+ " * ";
	}
	
}
