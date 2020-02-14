import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player;

    @Before
    public void before(){
        player = new Player("Bob");
    }

//    @Test
//    public void playerStartsWithNoCard(){
//        assertEquals(null, player.getCard());
//    }

    @Test
    public void playerStartsWithNoCardsInHand(){
        assertEquals(0, player.getHand().size());
    }

    @Test
    public void playerHasName(){
        assertEquals("Bob", player.getName());
    }
}
