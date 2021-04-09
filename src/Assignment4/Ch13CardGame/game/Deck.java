/**
 * Deck.java (complete)
 * Jonathan Wheeler
 *
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

    int cardsLeft = getCurrentSize();
    Card dealt = removeCard(cardsLeft-1);

    return dealt;
  }

  /**
   * Shuffle all cards currently in a deck
   */
  public void shuffle() {
    //Remove a random card from the deck then put it back on top of the deck
    //Do that 52 times
    for (int unshuffled = getCurrentSize()-1;
             unshuffled >= 0;
             unshuffled--)
    {
      int randomCard = ThreadLocalRandom.current().nextInt(0, getCurrentSize());
      Card removed = removeCard(randomCard);
      addCard(removed);
     }


  } // end shuffle

} // end class Deck