package Assignment6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;


public class Project extends JFrame{

    private static final int WIDTH = 300;
    private static final int HEIGHT = 250;
    private String message = "The background color of the button will \nchange randomly among" +
            "\nRed, White, Yellow, Green, Blue" +
            "\nevery time the button is pressed.";

    //private TextArea textBox;

    public Project() {
        setTitle("Color Changing Button");
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createContents(message);
        //pack();
        setVisible(true);
    }

    private void createContents(String message) {
      JTextArea textBox = new JTextArea(message);
      textBox.setEditable(false);
      JTextArea textBox2 = new JTextArea();
      JButton colorChange = new JButton("Change Color");
      colorChange.setBackground(Color.WHITE);
      colorChange.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              int randNum = ThreadLocalRandom.current().nextInt(0,5);
              switch (randNum) {
                  case 0:
                      colorChange.setBackground(Color.WHITE);
                      textBox2.append("White\n");
                      break;
                  case 1:
                      colorChange.setBackground(Color.BLUE);
                      textBox2.append("Blue\n");
                      break;
                  case 2:
                      colorChange.setBackground(Color.RED);
                      textBox2.append("Red\n");
                      break;
                  case 3:
                      colorChange.setBackground(Color.YELLOW);
                      textBox2.append("Yellow\n");
                      break;
                  case 4:
                      colorChange.setBackground(Color.GREEN);
                      textBox2.append("Green\n");
                      break;
              }

          }
      });
      add(textBox);
      add(colorChange);
      add(textBox2);
    }

    public static void main(String[] args) {
        /* JFrame frame = new JFrame("Color Changing Button");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300  );
        frame.setVisible(true);
        */

        new Project();
    }
}
