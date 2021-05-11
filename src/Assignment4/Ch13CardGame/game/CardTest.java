package Assignment4.Ch13CardGame.game;

import game.Card;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CardTest {
    Card card = new Card(2, 0);
    Card card2 = new Card(3, 0);

    @Test
    void testDisplay() {
        card.display();
    }

    @Test
    void testCompareTo() {
        int result = card.compareTo(new Card(2, 0));
        Assertions.assertEquals(0, result);
    }

    @Test
    void testToString() {
        String result = card.toString();
        Assertions.assertEquals("Club 2", result);
    }

    @Test
    void testEquals() {
        boolean result = card.equals(card);
        //Assertions.assertEquals(true, result);
        result = card.equals(card2);
        Assertions.assertEquals(false, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme