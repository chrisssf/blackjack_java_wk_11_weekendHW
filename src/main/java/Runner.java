public class Runner {

    public static void main(String[] args) {

        Dealer dealer = new Dealer();
        dealer.dealCards();
        String winner = dealer.pickWinner();
        System.out.println(winner);

//        dealer.dealToBothPlayers();
//        String winner = dealer.pickWinner();
//        System.out.println(winner);

    }
}
