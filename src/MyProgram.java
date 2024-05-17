import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please select what number game you would like to play: ");
        System.out.println("1. Cowboy Game Show");
        System.out.println("2. Number Guessing Game");
        System.out.println("3. Connections");
        System.out.println("4. TicTacToe");
        System.out.println("5. Exit");
        
        int userGameChoice= input.nextInt();
        
        if (userGameChoice==1){
            GameShow texasGame = new GameShow();
            texasGame.questionOneFunction(); 
            texasGame.questionTwoFunction();
            texasGame.questionThreeFunction();
            texasGame.questionFourFunction();
            texasGame.questionFiveFunction();
            texasGame.questionSixFunction();
            texasGame.outroFunction();
        }
        if (userGameChoice==2){
            GuessingGame numberGame= new GuessingGame();
            numberGame.run();
        }
        if (userGameChoice==3){
            Connections.main(args);
            
        }
        if (userGameChoice==4){
            TicTacToeTester tictactoe= new TicTacToeTester();
            tictactoe.playGame();
        }
        if (userGameChoice==5){
            System.out.println("You have exited the arcade.");
        }
        
    }
}