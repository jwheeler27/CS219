/*
 * MailingListView.java (complete. ADD 1~6)
 * CS219
 * Jonathan Wheeler
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
import java.awt.event.ActionEvent;
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
    setTitle("Welcome to Wheeler Group 6");
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
  //return whatever is typed into the textfield (emailField)
  public String getEmail()
  {
    return emailField.getText();
  }

  // set the text in the textfield (emailField)
  public void setEmail(String email)
  {
       emailField.setText(email);

  }


  //set the text of the result label
  public void setResult(String result)
  {
    resultLabel.setText(result);
  }

  // open a popup that contains the error msg passed
  void displayErrorMessage(String errorMessage)
  {
    JOptionPane.showMessageDialog(null, errorMessage);
  }

  // If the addButton is clicked execute an event handling method in
  // the controller named actionPerformed
  void addAddListener(ActionListener listenForAddButton)
  {

    addButton.addActionListener(listenForAddButton);
  }

  // If the removeButton is clicked execute an event handling method in
  // the controller named actionPerformed
  void addRemoveListener(ActionListener listenForRemoveButton)
  {

    removeButton.addActionListener(listenForRemoveButton);
  }

} // end class MailingListView