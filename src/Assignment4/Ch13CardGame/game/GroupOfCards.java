/**
 * GroupOfCards.java (partial, 2 ADD CODE)
 * Implements a group of cards and provides methods
 * to add a card and remove a card
 * Project: Ch13 Card Game
 *
 * CS219
 */

package game;

import java.util.ArrayList;

// Implements a group of cards
public class GroupOfCards
{
  private ArrayList<Card> cards; // list of cards in the group

  //*******************************************

  /**
   * Create an object which is capable of
   * holding multiple cards. Doesn't actually
   * create and add card objects. That's up
   * to individual child class
   */
  public GroupOfCards() {
    cards = new ArrayList<Card>();
  }

  //*******************************************

  public int getCurrentSize() {
    return cards.size();
  }

  //*******************************************

  public void display() {
    System.out.println(cards);
  }

  //*******************************************

  /**
   * Add a card to high end of list: append
   *
   * @param card
   */
  public void addCard(Card card) {
    // ADD CODE #1
  }

  //*******************************************
  /**
   * Remove and return a card object at a specified location
   *
   * @param index  the index of the element to be removed
   * @return  the card object just removed.
   */
  public Card removeCard(int index) {
    // ADD CODE #2: remove return null line and add code
    return null; // fake return
  }

} // end class GroupOfCards