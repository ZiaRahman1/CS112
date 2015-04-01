import javax.swing.JOptionPane;
public class Dice_Midterm {
	
	public static void main(String [] args)
	{
		int random;
		int counter = 0;
		int correctAnswers =0;
		int wrongAnswers = 0;
		int computerOdd =0;
		int playerEvenGuesses=0;
		float winPercentage = 0; 
		float oddPercentage=0;
		float evenPlayerGuesses=0;
		String computerGuess,reply,input,text; 

		do{
			counter++;
			random = 1 + (int)(Math.random() * 6);
			input = JOptionPane.showInputDialog( "Please enter your guess as \"ODD\" or \"Even\" ");
			
			if (input.equalsIgnoreCase("even"))
			{
				playerEvenGuesses++;
			}
			if ((random % 2) == 0 )
			{
				computerGuess = "even";
			}else
			{
				computerGuess = "odd";
				computerOdd++;
			}
			
			if (computerGuess.equalsIgnoreCase(input))
			{
				//JOptionPane.showMessageDialog(null, "Correct Guess!");
				correctAnswers++;
			}
			else
			{
				//JOptionPane.showMessageDialog(null, "Wrong Guess!");
				wrongAnswers++;
			}
//			JOptionPane.showMessageDialog(null, random);
//			JOptionPane.showMessageDialog(null, computerGuess);

            reply = JOptionPane.showInputDialog("Do you want to play again?.");
        }while(reply.equalsIgnoreCase("yes") ||reply.equalsIgnoreCase("y") );
		
		winPercentage = (float)((correctAnswers * 100)/counter );
		oddPercentage = (float)((computerOdd * 100)/counter );
		evenPlayerGuesses = (float)((playerEvenGuesses * 100)/counter );
		//JOptionPane.showMessageDialog(null, winPercentage);
		
		text = String.format("Number of games - %d\nNumber of Correct - %d\nNumber of Wrong - %d\nWinning Percentage - %.2f%% \nNumber of odd dice - %d \nNuber of Player even Guesses - %.2f%% \nDice odd percentage - %.2f%%",counter,correctAnswers,wrongAnswers,winPercentage,computerOdd,evenPlayerGuesses,oddPercentage);
		JOptionPane.showMessageDialog(null, text);
	}

}
