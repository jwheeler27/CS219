import javax.swing.*;
import java.awt.*;

public class Quizzes extends JFrame {
    private JTextField cTempTextField;
    private JTextField fTempTextField;
    private JButton fToCButton;  // F -> C conversion. Top button
    private JButton cToFButton;  // C -> F conversion. Bottom button

    public Quizzes() {
        setTitle("Temp Converter");

        // ADD CODE: set up the GUI interface
        JPanel window = new JPanel();
        setLayout(new GridLayout(2,3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.add(fTempTextField);
        window.add(fToCButton);
        window.add(cToFButton);
        window.add(cToFButton);
        // END ADD CODE

        pack();  // automatically adjust frame window size
    }
    public static void main(String[] args) {
        Quizzes test = new Quizzes();
    }
} // end class ConverterView