package com.skilldistillery.cards.common;

public enum Suit {

//public String getName() {
//	return name;
//}
	
	HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");


	private  String name;
	public String getName() {
		return name;
	}
	private Suit(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return this.name;
	}
}






