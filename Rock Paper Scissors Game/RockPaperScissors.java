import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        
        System.out.println("Welcome to Rock, Paper, Scissors Game!");
        System.out.println("Choose your move:");
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");
        System.out.println("4 - Exit the game");

        while (true) {
            System.out.print("Enter your choice (1/2/3/4): \n");
            int userChoice = sc.nextInt();

            if (userChoice == 4) {
                System.out.println("Thanks for playing! Goodbye!");
                break;
            }

            if (userChoice < 1 || userChoice > 4) {
                System.out.println("Invalid input. Please choose 1, 2, 3, or 4.");
                continue;
            }

            String userMove = choices[userChoice - 1];
            String computerMove = choices[rand.nextInt(3)];

            System.out.println("You chose: " + userMove);
            System.out.println("Computer chose: " + computerMove);

            if (userMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if ((userMove.equals("Rock") && computerMove.equals("Scissors")) ||
                       (userMove.equals("Paper") && computerMove.equals("Rock")) ||
                       (userMove.equals("Scissors") && computerMove.equals("Paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }
        
    }
}
