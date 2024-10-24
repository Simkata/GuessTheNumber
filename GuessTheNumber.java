import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;

        System.out.print("Guess the number between 1 and 100 - ");
        boolean isGuessed = false;

        while (!isGuessed) {
            int userGuess = Integer.parseInt(scanner.nextLine());
            if (userGuess > 100 || userGuess < 0) {
                System.out.println("Invalid Input. Try again.");
            } else if (userGuess < numberToGuess) {
                System.out.println("Try Higher");
            } else if (userGuess > numberToGuess){
                System.out.println("Try Lower");
            }
            else {
                System.out.printf("You guessed it! The number is %d", numberToGuess);
                isGuessed = true;
            }

        }
    }
}
