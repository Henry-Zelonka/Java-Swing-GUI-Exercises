import javax.swing.JOptionPane;

public class GuessNumber {

    static int number = (int)(Math.random() * 100 + 1);

    public static void main(String args[]){
        int guess = 200;

        while(guess != number){

            guess = Integer.parseInt(JOptionPane.showInputDialog("Guess a number from 1 to 100:"));

            if(guess > number)JOptionPane.showMessageDialog(null, "Too high!");
            else if(guess < number)JOptionPane.showMessageDialog(null, "Too low!");
            else JOptionPane.showMessageDialog(null, "Correct, the number was " + number + "!");

        }
    }
}
