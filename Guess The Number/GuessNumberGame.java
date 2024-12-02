import java.util.Scanner;
import java.util.Random;

public class GuessNumberGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) + 1;
        int numberOfTries = 0;
        int userGuess = 0;

        System.out.println("Welcome to Guess the Number!");
        System.out.println("Mainne ek number chhupa rakha hai, 1 se 100 ke beech. Tum guess karne ki koshish karo!");

        while (userGuess != numberToGuess) {
            System.out.print("Apna guess daalo: ");
            userGuess = sc.nextInt();
            numberOfTries++;

            if (userGuess < numberToGuess) {
                System.out.println("Arre! Bohot hi kam hai. Thoda aur socho aur zyada upar try karo!");
            } else if (userGuess > numberToGuess) {
                System.out.println("Bhai, yeh bohot zyada hai! Kya tum mujhe humesha bada number dena chahte ho?");
            } else {
                System.out.println("Dhinchak! Tumne sahi guess kiya! " + numberOfTries + " tries mein! Tum to sach mein genius nikle!");
            }
        }

    }
}
