public class ThreeDice extends Dice {

	private int sum;
	@Override
	public int roll() {
		sum = (super.roll() + super.roll() + super.roll()) / 3;
		return sum;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public boolean equals(Object d) {
		if (d instanceof ThreeDice)
			return (diceValue == ((ThreeDice) d).getDiceValue());
		else
			return false;
	}
}