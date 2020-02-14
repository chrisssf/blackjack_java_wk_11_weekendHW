import java.util.ArrayList;

public class Player {

//    private Card card;
    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
//        this.card = null;
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

//    public Card getCard(){
//        return this.card;
//    }

    public ArrayList<Card> getHand(){
        return this.hand;
    }


    public String getName() {
        return this.name;
    }

//    public void addCardToPlayer(Card card) {
//        this.card = card;
//    }

    public void addCardToHand(Card card){
        this.hand.add(card);
    }

}
