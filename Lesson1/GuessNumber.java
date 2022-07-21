public class GuessNumber {
    
    public static void main(String[] args) {
        int compNumber = 67;
        int playerNumber = 12;

        do {
            if (compNumber > playerNumber) { 
                System.out.printf("число %d больше того, что загадал компьютер\n", playerNumber);
                playerNumber++;
            } else {
                System.out.printf("число %d меньше того, что загадал компьютер\n", playerNumber);
                playerNumber--;
            }
        }
        while (compNumber != playerNumber);
        System.out.println("Вы победили!");
    }
}