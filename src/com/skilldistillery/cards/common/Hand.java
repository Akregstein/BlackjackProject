package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {

	public List<Card> cards;



	public Hand() {
		super();
		this.cards = new ArrayList<>();
	}

	public void addCard(Card card) {
		this.cards.add(card);

	}

	public void clear() {

	}

	public abstract int getHandValue();

	
	public Card showDealerCard() {
		return cards.get(0) ;
	}

	@Override
	public String toString() {
		return "Users hand: " + cards + " * total hand value: " + getHandValue();
	}
	
}
