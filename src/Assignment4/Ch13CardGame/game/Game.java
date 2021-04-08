/**
 * Game.java (partial, 1 ADD)
 * Implements a card game involving one deck of cards and
 * 2 players. Provides methods to play a card game
 * Project: Ch13 Card Game
 *
 * CS219
 */

package game;

// Implements a card game involving one deck of cards and 2 players
public class Game
{
  private Deck deck;    // The deck of cards to be played with
  private Hand player1; // Hand of cards held by player 1
  private Hand player2; // Hand of cards held by player 2

  //*******************************************

  /**
   * Create a new game with a default deck of
   * cards and two default hands
   */
  public Game() {
    deck = new Deck();
    player1 = new Hand();
    player2 = new Hand();
  }

  //*******************************************

  public void playAGame() {
    // 0. prepare the deck of cards
    deck.shuffle();

    // 1. deal all the cards to the two players
    while (deck.getCurrentSize() > 0)
    {
      player1.addCard(deck.dealCard());
      player2.addCard(deck.dealCard());
    }

    // 2. play
    int score1 = 0;  // score of player 1
    int score2 = 0;  // score of player 2

    // ADD CODE
    /*
    while (player1.getCurrentSize()>0 && player2.getCurrentSize()>0)
    {
      // 2.1 player 1 plays a card, display the card

      // 2.2 player 2 plays a card, display the card

      // 2.3 decide who scores and update scores

      // 2.4 print result of this round: print two cards played and current scores

    }
    */

    // 3. result of the game
    String resultStr = "";
    if (score1 == score2)
      resultStr = "Tie";
    else if (score1 < score2)
      resultStr = "Player2 won";
    else // 1 > 2
      resultStr = "Player1 won";
    System.out.println(resultStr);
  } // end PlayAGame
} // end class Game