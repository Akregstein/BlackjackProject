package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
//Dealer dealer = new Dealer();
private	List<Card>cards;

public Deck() {
    cards = createDeck();
  }
  
  public List<Card> createDeck(){
    List<Card> deck = new ArrayList<>(52);
    for(Suit s : Suit.values()) {
      for(Rank r : Rank.values()) {
        deck.add(new Card(s, r));
      }
    }
    return deck;
  }
  
	
	public int checkDeckSize() {
		
		
		return cards.size();
	}
	
	public Card dealCard() {
		
		return cards.remove(0);
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	public Card showDealerCard() {
	
		return cards.get(0) ;
		
	}
	public Card showDealerCard2() {
		
		return cards.get(1) ;
		
	}
}
