import java.lang.Math;
import java.util.Scanner;
class numgame
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int lowerRange = 1;
        int upperRange = 100;
        int maxAttempts = 4; 
        int totalAttempts = 0;
        int roundsWon = 0;

        System.out.println("Welcome to the Number Game!");
        System.out.println("Guess the number between " + lowerRange + " and " + upperRange + ".");

        while (true) {
            int secretNumber = generateRandomNumber(lowerRange, upperRange);
            int attempts = 0;

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == secretNumber) {
                    System.out.println("Congratulations! You guessed it right!");
                    roundsWon++;
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("Too low! Try a higher number.");
                } else {
                    System.out.println("Too high! Try a lower number.");
                }
            }

            totalAttempts += attempts;

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }

        System.out.println("Game over! Rounds won: " + roundsWon);
        System.out.println("Total attempts: " + totalAttempts);
        scanner.close();
    }

    private static int generateRandomNumber(int lower, int upper) {
        return (int) (Math.random() * (upper - lower + 1)) + lower;
    }
}

