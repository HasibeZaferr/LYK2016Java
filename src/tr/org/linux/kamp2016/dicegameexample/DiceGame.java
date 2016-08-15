package tr.org.linux.kamp2016.dicegameexample;

public class DiceGame  {
	public static void main (String args[]) {
		// create two Die objects
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();

		// play the game
		dice1.roll();
		System.out.println("Player 1 has " + dice1.getFaceValue());
		dice2.roll();
		System.out.println("Player 2 has " + dice2.getFaceValue());

		// display the result

		if (dice1.getFaceValue() > dice2.getFaceValue()) {
			System.out.println("First player wins with " + dice1.getFaceValue());
		} else if (dice1.getFaceValue() < dice2.getFaceValue()) {
			System.out.println("Second player wins with " + dice2.getFaceValue());
		} else {
			System.out.println("Tie! Both players have " + dice1.getFaceValue());
		}


	}
	
	
}
