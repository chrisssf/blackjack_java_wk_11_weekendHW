import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Dealer dealer = new Dealer();


//        String numberOfPlayers = "";
//        while (!(numberOfPlayers.equals("1") || numberOfPlayers.equals("2") || numberOfPlayers.equals("3") || numberOfPlayers.equals("4") || numberOfPlayers.equals("5") || numberOfPlayers.equals("6"))){
//            System.out.println("Enter how many players between 1 and 6");
//            numberOfPlayers = scanner.next();
//        }
//        int players = parseInt(numberOfPlayers);
//
//        for (int i = 0; i < players; i++){
//
//        }


        dealer.dealCards();
        System.out.println(dealer.getDealerFirstCard());
        System.out.println("Player's current score is " + dealer.getPlayerScore());
        System.out.println("Player's cards: " + dealer.getPlayerCards());
        System.out.println("To get another card type twist(or t), to keep current score type stick(or s)");


        String input = scanner.next();
        while (!input.equals("stick") && !input.equals("s")){
            if (input.equals("twist") || input.equals("t")){
                dealer.givePlayerCard(dealer.getPlayer1());
                if (dealer.getPlayerScore() < 21) {
                    System.out.println("Player current score is " + dealer.getPlayerScore());
                    System.out.println("Player's cards: " + dealer.getPlayerCards());
                }
            } else {
                System.out.println("Enter a valid option!");
            }
            if (dealer.getPlayerScore() < 21) {
                input = scanner.next();
            } else {
                input = "stick";
            }
        }

        String winner = dealer.pickWinner();
        System.out.println(winner);
        System.out.println("Player's cards: " + dealer.getPlayerCards());
        System.out.println("Dealer's cards: " + dealer.getDealerCards());

//        dealer.dealToBothPlayers();
//        String winner = dealer.pickWinner();
//        System.out.println(winner);

    }
}
