/*
 * MailingListController.java (incomplete. ADD 1~2)
 * CS219
 *
 * Controller class for MVC MailingList GUI program.
 *
 * The controller coordinates interactions
 * between the View and the Model.
 *
 * Event-handling code is here, not by directly doing the work, but by:
 * - retrieve input from the View
 * - ask the Model to process the input
 * - take result from the Model and pass to the View for display
 */

package Assignment7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.WindowEvent;  // for  WindowClosing event
import java.awt.event.WindowAdapter;


public class MailingListController
{
  private MailingListView theView;
  private MailingListModel theModel;

  public MailingListController(MailingListView theView, MailingListModel theModel)
  {
    this.theView = theView;
    this.theModel = theModel;

    // register listeners
    this.theView.addWindowListener(new MailingListWindowAdapter());
    //this.theView.addAddListener(new MailingListAddListener());
    //this.theView.addRemoveListener(new MailingListRemoveListener());
  }


  // ADD #1. listener class for ActionEvent of add button of view class

  // algorithm
  /*
          call View method to retrieve user input
          call Model method to add email
          if succeeded
             retrieve status msg from Model and display in View (result label)
          else
             retrieve status msg from Model and display in popup winodw in View
          end if

  */


  // ADD #2. listener class for ActionEvent of remove button of view class

  // algorithm
  /*
          call View method to retrieve user input
          call Model method to remove email
          if succeeded
             retrieve status msg from Model and display in View (result label)
          else
             retrieve status msg from Model and display in popup winodw in View
          end if

  */



  // Handle window closing event.
  // WindowAdapter is an abstract class which implements WindowListener interface
  class MailingListWindowAdapter extends WindowAdapter
  {
    public void windowClosing(WindowEvent e) // specified in WindowListener interface
    {
      theModel.closeDown(); // this method will ask model to save updated mailing list
      System.exit(0);       // now exit this application
    } // end windowClosing
  } // end class MailingListWindowAdapter

} // end class MailingListController