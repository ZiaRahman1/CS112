import java.util.Scanner;


public class GuessANumber_Labc {
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		int number, random;
		String answer;
		random = 0 + (int) (Math.random() * 10);	
			
		System.out.print("Please enter a number between 1 -- 10. ");
		number = read.nextInt();
		if (number < 0  || number > 10)
		{
			System.out.println("You enter an invalid number.");			
		}else
		{	
			if (random == number )
			{
				System.out.printf("Your numbers (%d) is same as random number (%d).\n", number,random);
			}
			else if (random > number )
			{
				System.out.printf("Your number (%d) is smaller than random number (%d).\n",number,random);
			}else 
			{
				System.out.printf("Your number (%d) is larger than random number (%d).\n",number,random);
			}
		}
		
		System.out.println("Do you want to play again?");
		
		answer = read.next().toUpperCase();
		
		if (answer.equals("Y"))
		{
			System.out.println("Pleae re-run the program again");
		}
		else
		{
			System.out.println("Good Bye");
		}
	} 
}

// Good job
