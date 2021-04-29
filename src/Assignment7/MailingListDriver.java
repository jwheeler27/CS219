/*
 * MailingListDriver.java (complete)
 * CS219
 *
 * Driver class for MVC MailingList GUI program.
 *
 * Instantiate a View object and a Model,
 * and then instantiate a Controller with those two
 * and turn on the View
 */
package Assignment7;

public class MailingListDriver
{
  public static void main(String[] args)
  {
    MailingListView theView = new MailingListView();
    MailingListModel theModel = new MailingListModel();

    MailingListController theController = new MailingListController(theView, theModel);

    theView.setVisible(true);
  } // end main

} // end class MailingListDriver