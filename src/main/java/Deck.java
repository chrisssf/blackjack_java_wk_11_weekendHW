import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();

    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void addCards() {
        for(SuitType suit : SuitType.values()){
            for(RankType rank : RankType.values()){
                cards.add(new Card(suit, rank));
            }
        }
//        Collections.shuffle(cards);
    }

    public void shuffleCards(){
        Collections.shuffle(this.cards);
    }

    public Card dealCard() {
//        Deck deck = this.deck.addCards();
        return cards.remove(0);

    }
}
