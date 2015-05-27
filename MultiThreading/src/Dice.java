
public class Dice implements Runnable{
	
	private int numOfDice;
	private int diceValue;
	private int points;
	private int numberOfGemes;
	
	// constructor to set number of dices to play
	public Dice(int dice)
	{
		this.numOfDice = dice;
	}
	
	@Override
	public void run()
	{
		Throw();
		print();
		
	}
	// Rolls the dices for dice values
	public int Throw()
	{
		this.numberOfGemes++;
		this.diceValue = 0;
		for (int i=0; i<numOfDice; i++)
		{
			this.diceValue += 1 + (int)(Math.random() * 6);
		}
		return diceValue;
	}

	// Assign points based on user input number as middle number
	public void middleGuess(int guess)
	{
		if (middleValue() == guess)
		{
			points = points + 5;
		}else
		{
			points = points -1 ;
		}
	}
	
	// Assign points based on user input a High as input
	public void highGuess()
	{
		if (diceValue > middleValue())
		{
			points = points +1;
		}else
		{
			points = points -1;
		}
		
	}
	
	// Assign points based on user input a low as input
	public void lowGuess()
	{
		if (diceValue < middleValue())
		{
			points = points +1;
		}else
		{
			points = points - 1;
		}
	}
	
	// return random dice value
	public int diceValue()
	{
		return diceValue;
	}
	
	// return total points after game
	public int points()
	{
		return points;
	}
	
	// return the middle number bases on number of dice
	private int middleValue()
	{
		return (maxNumber()/2);
	}
	
	// Calculate the possible high number based on number of dices
	public int maxNumber()
	{
		return 6 * numOfDice;
	}
	
	public int numberOfGames()
	{
		return this.numberOfGemes;
	}
	
	public void print()
	{
		System.out.println("Number of Games:" + numberOfGames() + "Dice Value:" + diceValue());
	}
}
