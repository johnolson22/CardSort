public class Card {

	//Fields
	private int suit;
	private int rank;
	
	
	//Constructors
	public Card() {
		suit = 0;
		rank = 0;
	}
	
	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	public Card(String suit, int rank) {
		this.suit = suit2int(suit);
		this.rank = rank;	
	}
	
	public Card(String suit, String rank) {
		this.suit = suit2int(suit);
		this.rank = rank2int(rank);
	}
	
	public Card(int suit, String rank) {
		this.suit = suit;
		this.rank = rank2int(rank);
	}
	
	public Card(Card c) {
		this.suit = c.suit;
		this.rank = c.rank;
	}
	
	//Methods
	
	private int suit2int (String s) {
		switch(s) {
			case "clubs" : return 0;
			case "diamonds" : return 1;
			case "hearts" : return 2;
			case "spades" : return 3;
			default : return 0;
		}
	}
	
	public String suit2String (int s) {
		switch(s) {
			case 0 : return "clubs";
			case 1 : return "diamonds";
			case 2 : return "hearts";
			case 3 : return "spades";
			default : return "clubs";
		}
	}
	
	private int rank2int (String r) {
		switch(r) {
			case "ace" : 
			case "one" :	
				return 1;
			case "two" : return 2;
			case "three" : return 3;
			case "four" : return 4;
			case "five" : return 5;
			case "six" : return 6;
			case "seven" : return 7;
			case "eight" : return 8;
			case "nine" : return 9;
			case "ten" : return 10;
			case "jack" : 
			case "eleven" :	
				return 11;
			case "queen" : 
			case "twelve" :	
				return 12;
			case "king" : 
			case "thirteen" :	
				return 13;
			default : return 1;
		}		
	}
	
	
	
}
