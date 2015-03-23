import javax.swing.JOptionPane;

public class GuessANumber_GUI {

	public static void main(String[] args) {
		int number, random;
		 String messaage = "";
		random = 0 + (int) (Math.random() * 10);
		String input = "";

		do {
			input = JOptionPane
					.showInputDialog("Please enter a number between 1--10.");

			number = Integer.parseInt(input);
			if (random == number) {
				JOptionPane.showMessageDialog(null, "They are equal");
			} else if (random > number) {
				messaage = String.format("Your number(%d) is smaller than random number(%d)", number,random);
				JOptionPane.showMessageDialog(null,messaage);
			} else {
				messaage = String.format("Your number(%d) is larger than random number(%d)", number,random);
				JOptionPane.showMessageDialog(null,messaage);
			}
			input = JOptionPane.showInputDialog("Do you want to play again?.");

		} while (input.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "Good Bye");
	}
}
