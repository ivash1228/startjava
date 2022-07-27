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
        do {
            System.out.println(playerOne.getName()+ ", put your number: "); 
            playerOne.setNumber(scanner.nextInt());
            if (isGuessed(playerOne.getNumber())) {
                System.out.println(playerOne.getName() + ", you won!");
                break;
            }
            System.out.println(playerTwo.getName()+ ", put your number: "); 
            playerTwo.setNumber(scanner.nextInt());
            if (isGuessed(playerTwo.getNumber())) {
                System.out.println(playerTwo.getName() + ", you won!");
                break;
            }
        } while (true);
    }

    private void generateSecretNumber() {
        secretNumber = new Random().nextInt(100) + 1;
    }

    private boolean isGuessed(int number) {
        boolean result = false;
        if (number == secretNumber) {
            result = true;
        } else if (number < secretNumber) {
            System.out.println("Your number is less.");
        } else {
            System.out.println("Your number is greater.");
        }
        return result;
    }
}