public class Dice implements Cloneable {

	private int sides;
	int diceValue;
	private int history = 0;
	// Constructor of Dice class
	public Dice() {
		sides = 6;
		roll();
		history++;
	}

	// roll function
	public int roll() {
		diceValue = (int) (Math.random() * sides) + 1;
		if (diceValue > sides) {
			diceValue = sides;
		}
		return diceValue;
	}

	// get value of dice
	public int getDiceValue() {
		return diceValue;
	}
	
	// get number of object is created
	public int getHistory() {
		return history;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}