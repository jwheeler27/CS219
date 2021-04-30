/***********************************************************************
 * Project.java
 * Jonathan Wheeler
 * CS219 Unit 6
 *
 * Create a window with 2 textbox and a button. Button will change color
 * when pressed and the color will be added to the second textbox
 ************************************************************************/
package Assignment6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;


public class Project extends JFrame{

    //Set the width, height of the window
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    // Set the message that will be displayed in the first text box
    private String message = "The background color of the button will \nchange randomly among" +
            "\nRed, White, Yellow, Green, Blue" +
            "\nevery time the button is pressed.";

    /*********************************
     * Simple constructor, sets the:
     *  Title
     *  Window Size
     *  Layout Manager
     *  Default behavior
     *  Calls method to create actual contents
     */
    public Project() {
        setTitle("Color Changing Button");
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createContents(message);
        setVisible(true);
    }

    /*********************************************
     * Create the contents of the window:
     *  2 panels
     *      1st panel holds textbox1 with message inside
     *      colorChange button
     *
     *      2nd panel holds textBox2 to display the colors
     *
     *     add the two panels to the windows
     *
     *     Use a switch statement in the listener to change
     *     button color and display the color in the second
     *     textbox
     *
     * @param message
     */
    private void createContents(String message) {
        JPanel topPanel = new JPanel();
        JPanel bottomPanel = new JPanel();
        JTextArea textBox = new JTextArea(message);
        textBox.setEditable(false);
        JTextArea textBox2 = new JTextArea(5,10);
        textBox2.append("White\n");
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

        //Populate our window with our stuff
        topPanel.add(textBox);
        topPanel.add(colorChange);
        bottomPanel.add(textBox2);
        add(topPanel, BorderLayout.CENTER);
        add(bottomPanel);
    }

    public static void main(String[] args) {
        new Project();
    }
}
