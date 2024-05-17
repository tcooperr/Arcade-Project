import java.util.Scanner;
public class GuessingGame 
// extends ConsoleProgram
{
    public void run()
    {
        Scanner input= new Scanner(System.in);
        int guesses=0;
        int answer=(int)(Math.random()*100); //DO NOT EDIT THIS LINE
        // Start here!
        System.out.println("Guess the computer's number (0-100)");
        int userGuess= input.nextInt();
        guesses++;
        
        if (userGuess==answer){
            System.out.println("Congratulations!");
        }
        
        while (userGuess!=answer){
            if (userGuess<answer){
                System.out.println("The number is greater than " + userGuess);
                System.out.println("Guess the computer's number (0-100)");
                guesses++;
                userGuess= input.nextInt();
            }
            else if (userGuess>answer){
                System.out.println("The number is lower than " + userGuess);
                System.out.println("Guess the computer's number (0-100)");
                guesses++;
                userGuess= input.nextInt();
            }
        }
        if (userGuess==answer){
        System.out.println("Congratulations! You guessed the number in exactly " + guesses + " guesses!" );
        }
    }
}