//importing JoptionPane to display GUI
import javax.swing.JOptionPane;

public class App {
    //start out with the user being incorrect for the true/false question
    static boolean correct = false;
    //main method
    public static void main(String[] args) throws Exception{
        //loop until the user is correct
        while(!correct){
            //display a message asking a true or false question
            if (JOptionPane.showConfirmDialog(null, "Are whales fish?", "True or False Question",
            //get input from the user that is either yes or no
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                //if the user is incorrect, display a message telling them
                JOptionPane.showMessageDialog(null, "Incorrect. Try again.");
            } else{
                //if the user is correc, tell them, then set correct to true and exit the loop
                JOptionPane.showMessageDialog(null, "Correct. Good job!");
                correct = true;
            }
        }
        //instantiate a GuessNumber object
        GuessNumber guessNumber = new GuessNumber();
        //call the main method of GuessNumber
        guessNumber.guess();
    }
}        