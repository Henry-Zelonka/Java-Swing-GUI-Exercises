import javax.swing.JOptionPane;

public class App {
    static boolean correct = false;
    GuessNumber guessNumber = new GuessNumber();
    public static void main(String[] args) throws Exception{
        while(!correct){
            if (JOptionPane.showConfirmDialog(null, "Are whales fish?", "True or False Question",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Incorrect. Try again.");
            } else{
                JOptionPane.showMessageDialog(null, "Correct. Good job!");
                correct = true;
            }
        }
        GuessNumber.main(null);
    }
}