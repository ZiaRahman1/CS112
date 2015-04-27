import javax.swing.JOptionPane;


public class DiceGame_WK10 {

	public static void main(String[] args) {
		
		String reply,input, message; 
		String numberDice;

		do {
			
			numberDice = JOptionPane.showInputDialog( "Please enter number of Dice to play");			
			Dice dice = new Dice(Integer.parseInt(numberDice));
			dice.rollDice();
			message = String.format("Enter guess number for %s Dice(s) from %s to %d ", numberDice,numberDice,dice.maxNumber());
			input = JOptionPane.showInputDialog( message);
			
			if (dice.compare(Integer.parseInt(input)))
			{
				JOptionPane.showMessageDialog(null, "You Win");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "You lose");
				JOptionPane.showMessageDialog(null, "Random number was " + dice.randomNumber());
			}
			
			 reply = JOptionPane.showInputDialog("Do you want to play again?.");
        }while(reply.equalsIgnoreCase("yes") ||reply.equalsIgnoreCase("y") );
		
		JOptionPane.showMessageDialog(null, "Good Bye");	
	}		
}
