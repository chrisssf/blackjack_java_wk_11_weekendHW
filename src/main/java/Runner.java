import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Dealer dealer = new Dealer();
        Scanner scanner = new Scanner(System.in);

        dealer.dealCards();
        System.out.println(dealer.getDealerFirstCard());
        System.out.println("Player current score is " + dealer.getPlayerScore());
        System.out.println("Player's cards: " + dealer.getPlayerCards());
        System.out.println("To get another card type twist, to keep current score type stick");


        String input = scanner.next();
        while (!input.equals("s")){
            if (input.equals("twist") || input.equals("t")){
                dealer.givePlayerCard(dealer.getPlayer1());
                System.out.println("Player current score is " + dealer.getPlayerScore());
                System.out.println("Player's cards: " + dealer.getPlayerCards());
            } else {
                System.out.println("Enter a valid option!");
            }
            input = scanner.next();
        }




//        if (input.equals("stick")){
//            String winner = dealer.pickWinner();
//            System.out.println(winner);
//        } else if (input.equals("twist")){
//            dealer.givePlayerCard(dealer.getPlayer1());
//            System.out.println("Player current score is " + dealer.getPlayerScore());
//        }

//        System.out.println(input);

        String winner = dealer.pickWinner();
        System.out.println(winner);
        System.out.println("Player's cards: " + dealer.getPlayerCards());
        System.out.println("Dealer's cards: " + dealer.getDealerCards());

//        dealer.dealToBothPlayers();
//        String winner = dealer.pickWinner();
//        System.out.println(winner);

    }
}
