import java.util.Scanner;


public class GuesANumer_IfElse {
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		int number, random;
		random = 0 + (int) (Math.random() * 10);	
			
		System.out.print("Please enter a number between 1 -- 10. ");
		number = read.nextInt();
		
		if (random == number )
		{
			System.out.printf("Your numbers (%d) is same as random number (%d)", number,random);
		}
		else if (random > number )
		{
			System.out.printf("Your number (%d) is smaller than random number (%d).",number,random);
		}else 
		{
			System.out.printf("Your number (%d) is larger than random number (%d).",number,random);
		}
	} 
}
