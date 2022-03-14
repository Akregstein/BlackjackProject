package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Dealer;
import com.skilldistillery.cards.common.Player;

public class Winners {
Player player = new Player();
	Dealer dealer = new Dealer();
	PlayerLoop pl = new PlayerLoop();
	public void winners(){
		if (player.getHandValue() < 21 && dealer.getHandValue() < 21) {
			
		}
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

