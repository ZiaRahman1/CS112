
public class Dice {

	private int numberDice;
	private int number;
	private boolean flag = false;
	
	public Dice(int numberDice)
	{
		this.numberDice = numberDice;
	}
	
	public void rollDice()
	{
		for (int i=0; i<numberDice; i++)
		{
			this.number += 1 + (int)(Math.random() * 6);
		}
	}
	
	public int maxNumber()
	{
		return 6 * numberDice;
	}
	
	public boolean compare(int userInput)
	{
		if (userInput == number)
		{
			flag = true;
		}
		return flag;
	}
	
	public int randomNumber()
	{
		return this.number;
	}
}
