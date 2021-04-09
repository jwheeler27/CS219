/**
 * Game.java (complete)
 * Jonathan Wheeler
 *
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

    while (player1.getCurrentSize()>0 && player2.getCurrentSize()>0)
    {
      //Get a card from the top of each players hand
      Card p1 = player1.playACard();
      Card p2 = player2.playACard();

      //Check to see which card is bigger and score accordingly
      int result = p1.compareTo(p2);
      if(result> 0)
      {
        score1++;
      }
      else
      {
        score2++;
      }

      System.out.print("Player 1: ");
      p1.display();
      System.out.print(" vs. Player 2: ");
      p2.display();
      System.out.println(" -> scores: " + score1 + " vs. " + score2);
    }


    // 3. result of the game
    String resultStr = "";
    if (score1 == score2)
      resultStr = "\nTie";
    else if (score1 < score2)
      resultStr = "\nPlayer2 won";
    else // 1 > 2
      resultStr = "\nPlayer1 won";
    System.out.println(resultStr);
  } // end PlayAGame
} // end class Game