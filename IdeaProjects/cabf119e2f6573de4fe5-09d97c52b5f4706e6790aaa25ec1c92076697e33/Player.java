
public class Player {

	private Hand hand;

	public Player() {
		hand = new Hand();
		
	}

	public void win() {

	}

	public void loss() {

	}

	// Gets a player's hand total
	public int getTotal() {
		return hand.calculateTotal();
	}


	public void addCard(Card card) {
		hand.addCard(card);

	}
	
	// Gets the player's cards to print as a string
	public String getHandString() {
		String str = "Cards:" + hand.toString();

		return str;
	}
		
	// Clears a player's hand
	public void clearHand() {
		hand.clearHand();
	}
		
} //End class