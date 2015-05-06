import javax.swing.JOptionPane;


public class Test2_WK12 {

	public static void main(String[] args) {
		String reply,input, message; 
		String numberDice;
		
		// user provide number of dices to play
		numberDice = JOptionPane.showInputDialog( "Please enter number of Dice to play");			
		Dices dice = new Dices(Integer.parseInt(numberDice));
		do {

			//System throws the dice
			dice.Throw();
			//JOptionPane.showMessageDialog(null, dice.diceValue());
			
			// player makes his moves by Guessing a number, or saying Low/High to play safe
			message = String.format("Enter your guess as Low, high or middle number. Range of values are from %s to %d ", numberDice,dice.maxNumber());
			input = JOptionPane.showInputDialog( message);
			
			if (input.equalsIgnoreCase("high"))
			{
				dice.highGuess();
				//JOptionPane.showMessageDialog(null,"Points are " + dice.points() + ", actual dice value " + dice.diceValue());
			}else if (input.equalsIgnoreCase("low"))
			{
				dice.lowGuess();
				//JOptionPane.showMessageDialog(null,"Points are " + dice.points()+ ", actual dice value " + dice.diceValue());
			}else
			{
				dice.middleGuess(Integer.parseInt(input)); 
				//JOptionPane.showMessageDialog(null,"Points are " + dice.points()+ ", actual dice value " + dice.diceValue());
			}
					
			// Ask user if they want to play again
			 reply = JOptionPane.showInputDialog("Do you want to play again?.");
			 
        }while(reply.equalsIgnoreCase("yes") ||reply.equalsIgnoreCase("y") );
		
		// Print the total points
		JOptionPane.showMessageDialog(null,"Total Points are " + dice.points() +  "\nNumber of game played: " + dice.numberOfGames());	
	}

}
