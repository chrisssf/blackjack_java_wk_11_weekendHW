import java.util.ArrayList;

public class Dealer {

    private Deck deck;
    private Player player1;
    private Player player2;
    private ArrayList<Card> hand;


    public Dealer(){
        this.deck = new Deck();
        this.player1 = new Player("Uno");
        this.player2 = new Player("Dos");
        this.hand = new ArrayList<Card>();
    }


    public Deck getDeck() {
        return deck;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void populateDeck(){
        this.deck.addCards();
    }

    public void givePlayerCard(Player player){
        Card card = this.deck.dealCard();
//        player.addCardToPlayer(card);
        player.addCardToHand(card);
    }

    public void giveDealerCard(){
        Card card = this.deck.dealCard();
        this.hand.add(card);
    }

    public void dealCards(){
        this.populateDeck();
        deck.shuffleCards();
        this.givePlayerCard(player1);
        this.giveDealerCard();
        this.givePlayerCard(player1);
        this.giveDealerCard();
    }

    public String pickWinner(){
        int playerScore = 0;
        int dealerScore = 0;
        for (Card card : this.player1.getHand()){
            playerScore += card.getRank().getScore();
        }
        for (Card card : this.hand){
            dealerScore += card.getRank().getScore();
        }
        if (playerScore > dealerScore){
            return "Player Wins";
        } else if (playerScore < dealerScore){
            return "Dealer Wins";
        } else {
            return "Draw";
        }
    }



//    these were hi/low methods..........

//    public void dealToBothPlayers(){
//        this.populateDeck();
//        deck.shuffleCards();
//        this.givePlayerCard(player1);
//        this.givePlayerCard(player2);
//    }

//    public String pickWinner(){
//        String winner;
//        int player1Score = player1.getCard().getRank().ordinal() + 1;
//        int player2Score = player2.getCard().getRank().ordinal() + 1;
//
//        if (player1Score > player2Score){
//            winner = player1.getName();
//        } else if (player1Score < player2Score){
//            winner = player2.getName();
//        } else {
//            winner = "Draw";
//        }
//        return winner;
//    }


}
