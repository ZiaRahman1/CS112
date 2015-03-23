import java.util.Scanner;


public class ForLoop {
	
	
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);

		int number, random;
	
		for(int i=1; i<4;i++)
		{
			System.out.printf("Counter is %d\n",i);
			System.out.printf("Please enter a number between 1 -- 10");
			number = read.nextInt();
			random = 0 + (int) (Math.random() * 10);
			//System.out.println(random);
			if (random == number) {
				System.out.println("Numbers are same");
			} else if (random > number) {
				System.out.printf("Your number(%d) is smaller than random number(%d).\n",number, random);
			} else {
				System.out.printf("Your number(%d) is larger than random number(%d).\n",number, random);
			}
			
		}
	}

}
