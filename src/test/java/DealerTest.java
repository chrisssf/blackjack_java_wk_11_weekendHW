import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DealerTest {

    private Dealer dealer;
    private Player player;
    private Card card;

    @Before
    public void before(){
        dealer = new Dealer();
        player = new Player("Bob");
        card = new Card(SuitType.HEARTS, RankType.TWO);
    }

    @Test
    public void dealerHasCards(){
        dealer.populateDeck();
        assertEquals(52, dealer.getDeck().getCards().size());
    }

    @Test
    public void canDealCards(){
        dealer.dealCards();
        assertEquals(2, dealer.getHand().size());
        assertEquals(48, dealer.getDeck().getCards().size());
    }


//    @Test
//    public void dealerCanGivePlayerACard(){
//        dealer.populateDeck();
//        dealer.givePlayerCard(player);
//        assertEquals(card.getRank(), player.getCard().getRank());
//        assertEquals(card.getSuit(), player.getCard().getSuit());
//    }

//    @Test
//    public void canPickWinner(){
//        dealer.dealToBothPlayers();
//        String winner = dealer.pickWinner();
//        assertEquals(1, winner);
//    }


}
