import java.util.Random;
import java.util.Scanner;


public class GuessNumber {
    
    public Player playerOne;
    public Player playerTwo;
    private int secretNumber;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start(Scanner scanner) {
        generateSecretNumber();
        boolean result = false;
            do {
                System.out.println(playerOne.getName()+ ", put your number: "); 
                playerOneSetNumber(scanner.nextInt());
                if (isGuessed(playerOneGetNumber())) {
                    result = true;
                    break;
                }
                System.out.println(playerTwo.getName()+ ", put your number: "); 
                playerTwoSetNumber(scanner.nextInt());
                if (isGuessed(playerTwoGetNumber())) {
                    result = true;
                    break;
                }
            } while (!result);
    }

    private void generateSecretNumber() {
        secretNumber = new Random().nextInt(100) + 1;
    }

    private boolean isGuessed(int number) {
    boolean result = false;
    if (number == secretNumber) {
        System.out.println("You won!");
        result = true;
    } else if (number < secretNumber) {
        System.out.println("Your number is less.");
    } else {
        System.out.println("Your number is greater.");
    }
    return result;
}

    private void playerOneSetNumber(int number) {
        playerOne.setNumber(number);
    }

    private void playerTwoSetNumber(int number) {
        playerTwo.setNumber(number);
    }

    private int playerOneGetNumber() {
        return playerOne.getNumber();
    }

    private int playerTwoGetNumber() {
        return playerTwo.getNumber();
    }
}