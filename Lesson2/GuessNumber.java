import java.util.Random;

public class GuessNumber {
    
    public Player playerOne;
    public Player playerTwo;
    private int secretNumber;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void setSecretNumber() {
        this.secretNumber = new Random().nextInt(100);
    }

    public void playerOneSetNumber(int number) {
        playerOne.setNumber(number);
    }

    public void playerTwoSetNumber(int number) {
        playerTwo.setNumber(number);
    }

    public int playerOneGetNumber() {
        return playerOne.getNumber();
    }

    public int playerTwoGetNumber() {
        return playerTwo.getNumber();
    }

    public boolean isGuessed(int number) {
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
}