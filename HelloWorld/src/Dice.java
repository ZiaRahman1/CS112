
public class Dice {

	private int numberDice;
	private int number;
	private int average;
	private boolean flag = false;
	
	public Dice(){}
	
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
	
	public int Throw (int bounce)
	{
		int [] bounceValues = new int[bounce];
		int avg = 0;
		for (int i=0; i<bounce; i++)
		{
			bounceValues[i] = 1 + (int)(Math.random() * 6);
			avg = avg + bounceValues[i];
			System.out.println(bounceValues[i]);
		}
		System.out.println("The average is :");
		 average = ((avg)/bounce );
		return average;
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
