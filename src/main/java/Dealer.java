import java.util.ArrayList;

public class Dealer {

    private Deck deck;
    private Player player1;
    private Player player2;
    private ArrayList<Card> hand;
    private String dealerCards;
    private String playerCards;



    public Dealer(){
        this.deck = new Deck();
        this.player1 = new Player("Uno");
        this.player2 = new Player("Dos");
        this.hand = new ArrayList<Card>();
        this.dealerCards = "";
        this.playerCards = "";
    }


    public Deck getDeck() {
        return deck;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public Player getPlayer1() {
        return player1;
    }

    public String getDealerCards() {
        return dealerCards;
    }

    public String getPlayerCards() {
        return playerCards;
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

    public int getPlayerScore(){
        int playerScore = 0;
        this.playerCards = "";
        int playerAces = 0;
        for (Card card : this.player1.getHand()){
            playerScore += card.getRank().getScore();
            this.playerCards = this.playerCards + card.getRank() + " of " + card.getSuit() + ", ";
            if (card.getRank() == RankType.ACE){
                playerAces += 1;
            }
        }
        if (playerScore > 21 && playerAces > 0){
            playerScore -= 10;
        }
        return playerScore;
    }

    public int getDealerScore(){
        int dealerScore = 0;
        this.dealerCards = "";
        int dealerAces = 0;
        for (Card card : this.hand){
            dealerScore += card.getRank().getScore();
            this.dealerCards = this.dealerCards + card.getRank() + " of " + card.getSuit() + ", ";
            if (card.getRank() == RankType.ACE){
                dealerAces += 1;
            }
        }
        if (dealerScore > 21 && dealerAces > 0){
            dealerScore -= 10;
        }
        return dealerScore;
    }

    public String getDealerFirstCard(){
        Card card = this.hand.get(0);
        return "Dealer's face up card is " + card.getRank() + " of " + card.getSuit();
    }


    public String pickWinner(){
        int playerScore = this.getPlayerScore();
        int dealerScore = this.getDealerScore();
        while ( dealerScore <= 16){
            this.giveDealerCard();
            dealerScore = this.getDealerScore();
        }
        if (playerScore > 21) {
            return "Player Loses!!! bust with " + playerScore;
        } else if (playerScore > dealerScore && playerScore <= 21 || playerScore <= 21 && dealerScore > 21){
            return "Player Wins!!! with " + playerScore + ", Dealer's score " + dealerScore;
        } else if (playerScore == dealerScore && playerScore <= 21){
            return "Draw, both scored " + dealerScore;
        } else {
            return "Dealer Wins!!! with " + dealerScore+ ", Player's score " + playerScore;
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
