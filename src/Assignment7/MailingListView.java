/*
 * MailingListView.java (incomplete. ADD 1~6)
 * CS219
 *
 * View class for MVC MailingList GUI program.
 *
 * This is the View. Its only job is to display what the user sees
 * It performs no processing, but instead passes information
 * entered by the user to whomever needs it, and displays results
 * passed back
 */
package Assignment7;

import javax.swing.*; // GUI components JXXX

import java.awt.*; // layout managers; Color, Font
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class MailingListView extends JFrame
{
  // GUI part
  private JTextField emailField;    // user input of email address
  private JButton addButton;        // Add
  private JButton removeButton;     // Remove
  private JLabel resultLabel;       // for output: result

  //*****************************************

  public MailingListView()
  {
    setTitle("Welcome to Fantastic Group");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    createContents();
    pack(); // automatically set window size based on components added
  }

  private void createContents()
  {
    // JPanel version
    setLayout(new GridLayout(0, 1, 0, 5));  // single column, 5 pixel vertical gap (between rows)

    // title section: just one label
    JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    JLabel titleLabel = new JLabel("Join Our Mailing List");
    titleLabel.setFont(new Font("Tahoma", Font.BOLD, 20)); // http://docs.oracle.com/javase/tutorial/uiswing/components/html.html
    titleLabel.setForeground(Color.BLUE);
    titlePanel.add(titleLabel);

    // section with textfield, and buttons
    JPanel contentPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

    emailField = new JTextField(20);
    emailField.setText("enter your email address");

    addButton = new JButton("Add");
    removeButton = new JButton("Remove");

    contentPanel.add(emailField);
    contentPanel.add(addButton);
    contentPanel.add(removeButton);

    // result section
    JPanel resultPanel = new JPanel();
    resultLabel = new JLabel();
    resultPanel.add(resultLabel);

    add(titlePanel);
    add(contentPanel);
    add(resultPanel);
  } // end createContens

  // getxxx/setxxx
  public String getEmail()
  {
    // ADD #1: retrieve the content of emailField
    return "fake"; // replace this fake return
  }

  public void setEmail(String email)
  {
    // ADD #2: set the content of emailField

  }

  public void setResult(String result)
  {
    // ADD #3: set the result label

  }

  // open a popup that contains the error msg passed
  void displayErrorMessage(String errorMessage)
  {
    // ADD #4
  }

  // If the addButton is clicked execute an event handling method in
  // the controller named actionPerformed
  void addAddListener(ActionListener listenForAddButton)
  {
    // ADD #5
  }

  // If the removeButton is clicked execute an event handling method in
  // the controller named actionPerformed
  void addRemoveListener(ActionListener listenForRemoveButton)
  {
    // ADD #6
  }

} // end class MailingListView