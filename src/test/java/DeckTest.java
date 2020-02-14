import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    private Deck deck;
//    private Card card;

    @Before
    public void before(){
        deck = new Deck();
//        card = new Card();
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.getCards().size());
    }

    @Test
    public void canAddCardsToDeck(){
        deck.addCards();
        assertEquals(52, deck.getCards().size());
    }

//    this is not a valid test, it was just to prove to myself the shuffle was working
//    @Test
//    public void cardsShuffled(){
//        deck.addCards();
//        deck.shuffleCards();
//        assertEquals(RankType.TWO, deck.getCards().get(0).getRank());
//    }

    @Test
    public void canDealCard(){
        deck.addCards();
        Card card = deck.dealCard();
        assertEquals(51, deck.getCards().size());
    }


}
