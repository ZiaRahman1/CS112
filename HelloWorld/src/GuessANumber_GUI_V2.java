import javax.swing.JOptionPane;

public class GuessANumber_GUI_V2 {
   
    public static void main(String[] args) {
        int number, random;
        String messaage = "";
        String input = "";
       
        do{
            boolean flag = true;
            random = 0 + (int) (Math.random() * 10);
            //JOptionPane.showMessageDialog(null, random);
            do {
                input = JOptionPane.showInputDialog("Please enter a number between 1--10.");
                number = Integer.parseInt(input);
                //JOptionPane.showMessageDialog(null, number);
                if (random == number) {
                    JOptionPane.showMessageDialog(null, "They are equal");
                    flag = false;
                } else if (random > number) {
                    messaage = String.format("Your number(%d) is smaller than random number(%d)",number, random);
                    JOptionPane.showMessageDialog(null, messaage);
                } else {
                    messaage = String.format("Your number(%d) is larger than random number(%d)",number, random);
                    JOptionPane.showMessageDialog(null, messaage);
                }
               
            } while (flag);
           
            input = JOptionPane.showInputDialog("Do you want to play again?.");
        }while(input.equalsIgnoreCase("yes") ||input.equalsIgnoreCase("y") );
       
        JOptionPane.showMessageDialog(null, "Good Bye");
    }
}