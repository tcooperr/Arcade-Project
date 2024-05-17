import java.util.Scanner;

public class TicTacToeTester
{
    

    public static void playGame(){
        
        System.out.println("Welcome to TicTacToe!!");
        System.out.println("");
        TicTacToe game = new TicTacToe();
        
        
        Scanner input= new Scanner(System.in);
        System.out.println("Initial Game Board");
        game.printBoard();
        
        while (true){
            System.out.println("What row would you like to place your piece on? ");
            int userRow= input.nextInt();
            System.out.println("What column would you like to place your piece on? ");
            int userCol= input.nextInt();
            if (game.pickLocation(userRow,userCol)== false){
                System.out.println("This spot is taken, please try again. Enter a new row");
                continue;
            }
            else{
                game.takeTurn(userRow,userCol);
                game.printBoard();
            }

            if (game.checkTie()==true){
                System.out.println("It's a draw!");
                break;
            }
            
            if (game.checkWin()==true){
                System.out.println("Game over! Congrats!");
                break;
                
            }
            System.out.println("It is now the next player's turn");

        }
        

        
    }

}