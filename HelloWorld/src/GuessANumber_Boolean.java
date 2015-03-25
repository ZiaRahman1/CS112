import javax.swing.JOptionPane;


public class GuessANumber_Boolean {

	public static void main(String[] args) {
		int number, random;
		 String messaage = "";
		 boolean result;
		random = 1 + (int) (Math.random() * 10);
		String input = "";

		do{
            boolean flag = true;
            random = 0 + (int) (Math.random() * 10);
            JOptionPane.showMessageDialog(null, random);
            do {
                input = JOptionPane.showInputDialog("Please enter a number between 1--10.");
                //number = Integer.parseInt(input);
                //JOptionPane.showMessageDialog(null, number);
                result = input.equalsIgnoreCase(Integer.toString(random));
                if (result) {
                    JOptionPane.showMessageDialog(null, "They are equal");
                    flag = false;
                } else {
                  
                    JOptionPane.showMessageDialog(null, "Try again");
                }
               
            } while (flag);
           
            input = JOptionPane.showInputDialog("Do you want to play again?.");
        }while(input.equalsIgnoreCase("yes") ||input.equalsIgnoreCase("y") );
       
        JOptionPane.showMessageDialog(null, "Good Bye");
    }

}
	

