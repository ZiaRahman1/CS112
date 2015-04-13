import javax.swing.JOptionPane;

public class TicTacToe {

	public static void main(String[] args) {
		String[] game = new String[9];
		String board = "";
		int random;
		int counter = 0;
		boolean win = false;
		String input,winner="";

		for (int i = 0; i < game.length; i++) {
			game[i] = Integer.toString(i + 1);
			// game[i] = "__";
		}

		while (!win) {
			board = String
					.format("  User = X\n ------------------------\n %s     %s     %s\n %s     %s     %s\n %s     %s     %s\n",
							game[0], game[1], game[2], game[3], game[4],
							game[5], game[6], game[7], game[8]);

			
			input = JOptionPane.showInputDialog(board);
			while (Integer.parseInt(input) < 1 || Integer.parseInt(input) > 9)
			{
				JOptionPane.showMessageDialog(null, "Pick another number between 1 -9");
				input = JOptionPane.showInputDialog(board);
			}

			while (game[Integer.parseInt(input) - 1] == "\u2713" || game[Integer.parseInt(input) - 1] == "X" ) {
				JOptionPane.showMessageDialog(null, "Pick another number");
				input = JOptionPane.showInputDialog(board);
			}
			game[Integer.parseInt(input) - 1] = "X".toUpperCase();
			counter++;
			
			if (counter > 2) {
				if ((game[0] == "X" && game[1] == "X" && game[2] == "X")
						|| (game[3] == "X" && game[4] == "X" && game[5] == "X")
						|| (game[6] == "X" && game[7] == "X" && game[8] == "X")
						|| (game[0] == "X" && game[3] == "X" && game[6] == "X")
						|| (game[1] == "X" && game[4] == "X" && game[7] == "X")
						|| (game[2] == "X" && game[5] == "X" && game[8] == "X")
						|| (game[0] == "X" && game[4] == "X" && game[8] == "X")
						|| (game[2] == "X" && game[5] == "X" && game[8] == "X")) {
					//JOptionPane.showMessageDialog(null, "You Won");
					winner = "You won!";
					win = true;
				} 

			} // end of if
			
			if (!win) {
				random = 1 + (int) (Math.random() * 9);

				while (game[random - 1] == "\u2713" || game[random - 1] == "X") {
					random = 1 + (int) (Math.random() * 9);
				}

				game[random - 1] = "\u2713";
				 if ((game[0] == "\u2713" && game[1] == "\u2713" && game[2] == "\u2713")
							|| (game[3] == "\u2713" && game[4] == "\u2713" && game[5] == "\u2713")
							|| (game[6] == "\u2713" && game[7] == "\u2713" && game[8] == "\u2713")
							|| (game[0] == "\u2713" && game[3] == "\u2713" && game[6] == "\u2713")
							|| (game[1] == "\u2713" && game[4] == "\u2713" && game[7] == "\u2713")
							|| (game[2] == "\u2713" && game[5] == "\u2713" && game[8] == "\u2713")
							|| (game[0] == "\u2713" && game[4] == "\u2713" && game[8] == "\u2713")
							|| (game[2] == "\u2713" && game[5] == "\u2713" && game[8] == "\u2713")) {
						//JOptionPane.showMessageDialog(null, "Computer Won");
					 winner = "Computer won!";
						win = true;
					}// end of if-else
			}
		}// end of while loop

		board = String
				.format("  %s\n ------------------------\n %s     %s     %s\n %s     %s     %s\n %s     %s     %s\n",
						winner,game[0], game[1], game[2], game[3], game[4],
						game[5], game[6], game[7], game[8]);
		JOptionPane.showMessageDialog(null, board);
	}
}// end of class

