public class Scorer {

    private int score;
    private Player player;
    private Dealer dealer;

    public Scorer(Player player){
        this.score = 0;
        this.player = player;
    }

    public Scorer(Dealer dealer){
        this.score = 0;
        this.dealer = dealer;
    }

    public int getPlayerScore(){
        int score = 0;
        for (Card card : this.player.getHand()){
            score += card.getRank().getScore();
        }
        return score;
    }

    public int getDealerScore(){
        int score = 0;
        for (Card card : this.dealer.getHand()){
            score += card.getRank().getScore();
        }
        return score;
    }


}
