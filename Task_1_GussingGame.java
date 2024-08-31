import java.util.Scanner;
import java.util.Random;

    public class Task_1_GussingGame
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            Random ran = new Random();

            int minRange = 1, maxRange = 100,maxAttempts = 5, score = 0, attempts=0,userGuess;
            int randomNumber;

            boolean playAgain = true;

            while (playAgain)
            {
                randomNumber = ran.nextInt(maxRange - minRange + 1) + minRange;
                System.out.println("Welcome to the Guessing Game");
                System.out.println("I have selected a random number between " + minRange + " and " + maxRange + ". Can you guess it?");
                boolean guessedCorrectly = false;

                while (attempts < maxAttempts)
                {
                    System.out.print("Enter your guess number: ");
                    userGuess = scanner.nextInt();
                    attempts++;

                    if (userGuess == randomNumber)
                    {
                        System.out.println("Congratulations! You guessed the number correctly in " + attempts + " attempts.");
                        score++;
                        guessedCorrectly = true;
                        break;
                    }
                    else if (userGuess < randomNumber)
                    {
                        System.out.println("Too low. Try again.");
                    }
                    else
                    {
                        System.out.println("Too high.Try again.");
                    }
                }

                if (!guessedCorrectly)
                {
                    System.out.println("Sorry, you have run out of attempts. The correct number was: " + randomNumber);
                }

                System.out.println("Your current score is: " + score);
                System.out.print("Do you want to play again? (yes/no): ");
                String playAgainResponse = scanner.next();
                playAgain = playAgainResponse.equalsIgnoreCase("yes");
            }

            System.out.println("Thank you for playing!");

        }
    }


