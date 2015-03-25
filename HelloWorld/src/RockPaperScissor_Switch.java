import java.util.Scanner;
import javax.swing.JOptionPane;

public class RockPaperScissor_Switch {

	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		String player_1;
		int random;
		String computer = "";

		boolean stop = true;
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
			//JOptionPane.showMessageDialog(null, computer);
			player_1 = JOptionPane
					.showInputDialog("Please enter your choice: Rock, scissor,or paper.");

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
					JOptionPane.showMessageDialog(null, "compuer win");
					break;
				case "scissor":
					JOptionPane.showMessageDialog(null, "Tie");
					break;
				}
			default:
				break;
			}

		
		} while (true);
	}
}
