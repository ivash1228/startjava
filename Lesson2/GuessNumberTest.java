import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yesNo = "";

        System.out.println("First player name:");
        Player playerOne = new Player(scanner.next());
        System.out.println("Second player name:");
        Player playerTwo = new Player(scanner.next());

        do {
            GuessNumber game = new GuessNumber(playerOne, playerTwo);
            game.setSecretNumber();
            boolean result = false;
            do {
            System.out.println(game.playerOne.getName()+ ", put your number: "); 
            game.playerOneSetNumber(scanner.nextInt());
            if (game.isGuessed(game.playerOneGetNumber())) {
                result = true;
                break;
            }
            System.out.println(game.playerTwo.getName()+ ", put your number: "); 
            game.playerTwoSetNumber(scanner.nextInt());
            if (game.isGuessed(game.playerTwoGetNumber())) {
                result = true;
                break;
            }
            } while (!result);
            do {
                System.out.println("Do you want to play one more time?");
                yesNo = scanner.next();
            } while (!yesNo.equals("yes") && !yesNo.equals("no"));
        } while (!yesNo.equals("no"));
    }
}