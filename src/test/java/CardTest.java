import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    private Card card;
//    private Deck deck;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, RankType.TWO);
//        deck = new Deck();
//        player = new Player();
//        dealer = new Dealer();
    }

    @Test
    public void canGetSuit() {
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.TWO, card.getRank());
    }

}
