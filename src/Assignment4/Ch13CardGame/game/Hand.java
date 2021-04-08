/**
 * Hand.java (partial, 1 ADD, 1 optional ADD)
 * Implements a hand of cards and provides methods
 * to work with cards such as play a card and sort
 * all cards currently in hand
 * Project: Ch13 Card Game
 *
 * CS219
 */

package game;

import java.util.concurrent.ThreadLocalRandom; // will be used

/*Implements a hand of cards and provides methods
 * to work with cards such as play a card and sort
 * all cards currently in hand
*/
public class Hand extends GroupOfCards
{
  /**
   * Play a card depending on playing strategy.
   * Will remove and return that card
   *
   * @return the card being played
   */
  public Card playACard() {
    // ADD CODE #1: remove return null line and add code
    // 1. decide which card to move: pick a random card
    // 2. remove and return that card

    return null; // fake return
  }

  /**
   * (Optional) Sort all cards in hand following some strategy
   */
  public void sort() {
    // ADD CODE #2 (optional)
  }

} // end class Hand