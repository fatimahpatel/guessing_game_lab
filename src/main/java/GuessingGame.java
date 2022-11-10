import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("Welcome! Can you guess the number I'm thinking of? ");
        Scanner reader = new Scanner(System.in);
        String userGuess = reader.nextLine();

        int userGuessInteger = Integer.parseInt(userGuess); //Integer.parseInt(x) converts string to integer


        System.out.println("You guessed the number: " + userGuessInteger);

        if (userGuessInteger == 5){
            System.out.println("Wow! You guessed correctly. How did you know??");

        }
        else if (userGuessInteger > 5 ){
            System.out.println("Oops, your guess is too high!");
        }
        else{
            System.out.println("Oops, your guess is too low!");
        }




    }
}
