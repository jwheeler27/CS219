/**
 * Deck.java (partial, 2 ADD CODE)
 * Implements a deck of 52 cards and provides methods
 * to work with cards such as deal a card and shuffle
 * the whole deck
 * Project: Ch13 Card Game
 *
 * CS219
 */

package game;

import java.util.concurrent.ThreadLocalRandom;  // will be used

// Implements a deck of 52 cards
public class Deck extends GroupOfCards
{
  public final static int TOTAL_NUM_CARDS = 52; // Number of cards in a deck

  //*******************************************

  /**
   * Create a deck of cards and add cards of (num, suit)
   * with
   *  num: 2-14, use 11-14 for J, Q, K, A
   *  suit: 0-3 for "Club"<"Diamond"<"Heart"<"Spade"
   *
   *  Cards are created and added to deck in order of:
   *     (2, 0/Club) - (14, 0/Club) then
   *     (2, 1/Diamond) - (14, 1/Diamond) then
   *     (2, 2/Heart) - (14, 2/Heart) and finally
   *     (2, 3/Spade) - (14, 3/Spade)
   */
  public Deck() {
    for (int i=0; i<TOTAL_NUM_CARDS; i++)
    {
      addCard(new Card(2 + i%13, i/13));
    }
  }

  //*******************************************

  /**
   * Deal the card at the end of the deck by removing
   * it from the deck and return it
   *
   * @return  the card removed
   */
  public Card dealCard() {
  // ADD CODE #1: remove return null line
    return null; // fake return
  }

  /**
   * Shuffle all cards currently in a deck
   */
  public void shuffle() {
    // ADD CODE #2

    /*
    The approach described in Exercise #8 of Ch13:

    for (int unshuffled = getCurrentSize()-1;
             unshuffled >= 0;
             unshuffled--)
    {
      // 1. pick a random card

      // 2. remove that random card

      // 3. add that card back to high end of the deck

    }
    */

  } // end shuffle

} // end class Deck