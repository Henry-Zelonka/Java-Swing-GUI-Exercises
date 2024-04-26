//importing JoptionPane to display GUI
import javax.swing.JOptionPane;

public class GuessNumber {

    //generate a random number for the user to guess
    static int number = (int)(Math.random() * 100 + 1);

    public void guess(){
        
        //guess variable starts outside the range of numbers that can be generated so it is guaranteed not ot match the number
        int guess = 200;

        //loop while the user's guess is not equal to the correct number
        while(guess != number){

            //ask the user to guess a number within the range of 1 to 100
            guess = Integer.parseInt(JOptionPane.showInputDialog("Guess a number from 1 to 100:"));

            //if the user's guess it too high or low, tell them
            if(guess > number)JOptionPane.showMessageDialog(null, "Too high!");
            else if(guess < number)JOptionPane.showMessageDialog(null, "Too low!");
            //if the user guesses the correct number, tell them
            else JOptionPane.showMessageDialog(null, "Correct, the number was " + number + "!");

        }
    }
}
