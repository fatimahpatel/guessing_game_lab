import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        byte secretNumber = (byte) 5;
        System.out.println("Welcome! Can you guess the number I'm thinking of? ");
        Scanner reader = new Scanner(System.in);
        String userGuess = reader.nextLine();


        System.out.println("You guessed the number: " + userGuess);

        if (userGuess.equals("secretNumber")){
            System.out.println("Wow! You guessed correctly. How did you know??");

        }
        else{
            System.out.println("Oops, that's not right!");
        }




    }
}
