import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First player name:");
        Player playerOne = new Player(scanner.next());
        System.out.println("Second player name:");
        Player playerTwo = new Player(scanner.next());
        GuessNumber game = new GuessNumber(playerOne, playerTwo);
        game.start(scanner);
    }
}