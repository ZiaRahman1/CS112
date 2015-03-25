
import javax.swing.JOptionPane;

public class RockPaperScissor_Switch {

	public static void main(String[] args)
	{

		String player_1;
		int random;
		String input = "";
		String computer = "";

		do {

			random = 1 + (int) (Math.random() * 3);
			switch (random) {
			case 1:
				computer = "Rock";
				break;
			case 2:
				computer = "Scissor";
				break;
			default:
				computer = "Paper";
			}
			JOptionPane.showMessageDialog(null, computer);
			player_1 = JOptionPane.showInputDialog("Please enter your choice: Rock, scissor,or paper.");

			switch (player_1.toLowerCase()) {
			case "rock":
				switch (computer.toLowerCase()) {
				case "rock":
					JOptionPane.showMessageDialog(null, "Tie");
					break;
				case "paper":
					JOptionPane.showMessageDialog(null, "Computer win");
					break;
				case "scissor":
					JOptionPane.showMessageDialog(null, "Player win");
					break;
				}
				break;
			case "scissor":
				switch (computer.toLowerCase()) {
				case "rock":
					JOptionPane.showMessageDialog(null, "Computer win");
					break;
				case "paper":
					JOptionPane.showMessageDialog(null, "player win");
					break;
				case "scissor":
					JOptionPane.showMessageDialog(null, "Tie");
					break;
				}
				break;
			case "paper":
				switch (computer.toLowerCase()) {
				case "rock":
					JOptionPane.showMessageDialog(null, "player win");
					break;
				case "paper":
					JOptionPane.showMessageDialog(null, "Tie");
					break;
				case "scissor":
					JOptionPane.showMessageDialog(null, "Computer Win");
					break;
				}
			default:
				break;
			}

			 input = JOptionPane.showInputDialog("Do you want to play again?.");
        }while(input.equalsIgnoreCase("yes") ||input.equalsIgnoreCase("y") );
       
        JOptionPane.showMessageDialog(null, "Good Bye");
	}
}
