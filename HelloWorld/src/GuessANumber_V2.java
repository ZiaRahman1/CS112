import java.util.Scanner;

public class GuessANumber_V2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int number, random;
		int programCounter = 0;
		int correctGuess = 0;
		int wrongGuess = 0;
		float successRate=0;
		float failureRate=0;

		System.out.printf("Please enter a number between 1 -- 10, OR -1 to EXIT");
		number = read.nextInt();

		while (number != -1) {
			random = 0 + (int) (Math.random() * 10);
			System.out.println(random);
			if (random == number) {
				System.out.println("Numbers are same");
				correctGuess += 1;
			} else if (random > number) {
				System.out.printf("Your number(%d) is smaller than random number(%d).\n",number, random);
				wrongGuess += 1;
			} else {
				System.out.printf("Your number(%d) is larger than random number(%d).\n",number, random);
				wrongGuess += 1;
			}
			programCounter += 1;
			System.out.print("\nPlease enter a number between 0 -- 10. -- OR enter -1 to exit");
			number = read.nextInt();
		}
		successRate = correctGuess/programCounter;
		failureRate = (wrongGuess/programCounter)*100;
		System.out.println(successRate);
		System.out.println(failureRate);
		System.out.printf("\nTotal run = %d, Total Success = %d, Total Failure = %d\n",programCounter, correctGuess, wrongGuess);
		System.out.printf("\nSuccess rate = %f and failure rate = %f ",successRate, failureRate);
		System.out.println("Good Bye.");
	}
}
//Good job
