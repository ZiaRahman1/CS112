import java.util.Scanner;

public class GuessANumber_V2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int number, random;
		int programCounter = 0;
		int correctGuess = 0;
		int wrongGuess = 0;

		do {
			random = 0 + (int) (Math.random() * 10);
			System.out.printf("Random number is %d\n.", random);

			System.out.print("Please enter a number between 1 -- 10. or enter -1 to exit");
			number = read.nextInt();

			if (random == number) {
				System.out.println("Numbers are same");
				correctGuess+=1;
			}
			if (random > number) {
				System.out.println("Your number is smaller than random number.");
				wrongGuess+=1;
			}
			if (random < number) {
				System.out.println("Your number is larger than random number.");
				wrongGuess+=1;
			}

		} while (number != -1);

	}
}
