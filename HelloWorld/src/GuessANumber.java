import java.util.Scanner;


public class GuessANumber {

	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int number, random;
		
		random = 1 + (int) (Math.random() * 10);
		System.out.printf("Random number is %d\n.",random);
		
		System.out.println("Please enter a number between 1 -- 10.");
		number = read.nextInt();
		
		if (random == number )
		{
			System.out.println("Numbers are same");
		}
		if (random > number )
		{
			System.out.println("Your number is smaller than random number.");
		}
		if (random < number )
		{
			System.out.println("Your number is larger than random number.");
		}
	} 
}
