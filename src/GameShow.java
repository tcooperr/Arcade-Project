import java.util.Scanner;

public class GameShow {
    Scanner input = new Scanner(System.in);
   
    private static double userScore;
    private String userName;
    private final String QUESTION_ONE= "What state in America is known as the'Cowboy Capital of the World?";
    private final String CORRECT_ANSWER_ONE= "Texas";
    private final  String QUESTION_TWO= " true or false, Cowboy shootouts were very common in the West.";
    private final Boolean CORRECT_ANSWER_TWO= false;
    private final String QUESTION_THREE= " What year did the period of the Wild west begin?";
    private final int CORRECT_ANSWER_THREE= 1895;
    private final String QUESTION_FOUR= "What percent of cowboys are men?";
    private final double CORRECT_ANSWER_FOUR= 67.2;
    private final String QUESTION_FIVE= "What city's football team goes by the Cowboys?";
    private final String CORRECT_ANSWER_FIVE= "Dallas";
    private final String QUESTION_SIX= "What is the average cowboy salary?";
    private final char CORRECT_ANSWER_SIX= 'a'; 
   
    public GameShow() 
    {
        userScore = 0;
        System.out.print("Howdy Y'all! Welcome to The Cowboy Gameshow! Today we have ");
        userName= input.nextLine();
        System.out.println("with us.");
        System.out.println(" ");
        System.out.println(userName + " can you give us a quick introduction? Where you from and how old are you?");
        String userIntro= input.nextLine();
        System.out.println(" ");       
        System.out.println("Woo wee sounds lovely! Now lets begin our Cowboy Trivia. ");
        System.out.println(" ");
        
    }
   
    public void questionOneFunction(){
        Scanner input = new Scanner(System.in);
        readyFunction();
        System.out.println(" ");
        System.out.println("Question 1: " + QUESTION_ONE);
        String questionOneAnswer= input.nextLine();
        System.out.println(" ");
        if (questionOneAnswer.equalsIgnoreCase(CORRECT_ANSWER_ONE) )
        {
            userScore=userScore+1; 
            System.out.println("Correct! What a hog-killin' answer! You now have " + userScore + " points");
        }
        else
        {
            System.out.println("Wrong. You have " + userScore + " points. You got it nex time!");
        }
    }
    
    public void questionTwoFunction(){
        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        readyFunction();
        System.out.println(" ");
        System.out.println("Great! Question 2: " + QUESTION_TWO);
        boolean questionTwoAnswer= input.nextBoolean();
        System.out.println(" ");
        
        if (questionTwoAnswer==CORRECT_ANSWER_TWO)
        {
            userScore= userScore+1;
            System.out.println("Yeehaw good job! You now have " + userScore + " points.");
        }
        else
        {
            System.out.println("Wrong. Hollywood ain't always real! You currently have " + userScore + " points.");
        }
    } 
        
    ////// QUESTION 3 FUNCTION
    public void questionThreeFunction(){
        System.out.println(" ");
        readyFunction();
        System.out.println(" ");
        
        System.out.println(userName + " heres the 3rd question:" + QUESTION_THREE);
        int questionThreeAnswer= input.nextInt();
        System.out.println(" ");
        
        if (questionThreeAnswer==CORRECT_ANSWER_THREE)
        {
            userScore= userScore+1;
            System.out.println("You really are smart! Your score: " + userScore+ " points.");
        }
        else
        {
            System.out.println("Incorrect. You got it next time! Your score: " + userScore + " points.");
        }
    }
    
    ////// QUESTION 4 FUNCTION
     public void questionFourFunction(){
        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        readyFunction();
        System.out.println(" ");
        System.out.println("Woot woot! Here's question four: " + QUESTION_FOUR + " By the way, you don't need no % when inputting your answer.");
        double questionFourAnswer= input.nextDouble();
        System.out.println(" ");
        
        if (questionFourAnswer==CORRECT_ANSWER_FOUR)
        {
            userScore= userScore+1;
            System.out.println("Okayyyy I see you. You have " + userScore+ " points.");
        }
        else
        {
            System.out.println("No buddy I'm sorry. The correct answer is 67.2 percent. You now have " + userScore + " points.");
        }
     }
     //// QUESTION 5
    public void questionFiveFunction(){
        Scanner input= new Scanner(System.in);
        System.out.println(" ");
        readyFunction();
        System.out.println(" ");
        System.out.println(QUESTION_FIVE);
        String questionFiveAnswer= input.nextLine();
        System.out.println(" ");
        
        if (questionFiveAnswer.equalsIgnoreCase(CORRECT_ANSWER_FIVE) )
        {
            userScore=userScore+1; 
            System.out.println("Correct! Amazing! You now have " + userScore + " points");
        }
        else
        {
            System.out.println("Sorry nope! You now have" + userScore + " points. Better luck next time!");
        }
    }

    /// QUESTION SIX
    public void questionSixFunction(){
        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        readyFunction();
        System.out.println(" ");
        System.out.println("Okay I'm feeling kind of nice now. Since this is your last question and last chance to earn points for the big prize, it's going to be a multiple choice question." + QUESTION_FIVE + " Your three options are: ");
        System.out.println("a. $28,844");
        System.out.println("b. $90,620");
        System.out.println("c. $45,367");
        System.out.println("Please choose one letter. ");
        char questionSixAnswer= input.nextLine().toLowerCase().charAt(0);
        System.out.println(" ");
        
        if (questionSixAnswer==CORRECT_ANSWER_SIX)
        {
            userScore= userScore+1;
            System.out.println("Wow " +userName + "!! You are incredible. Your final score is "+ userScore+ " points.");
        }
        else
        {
            System.out.println("Aw shucks " +userName+ ". It was a tough one but you tried your best. Your final score is " + userScore + " points.");
        }
     }
    /// OUTRO FUNCTION
    public void outroFunction(){
        final double finalScore= (userScore/6) * 100;
        final double roundedScore= Math.round(finalScore*100)/ 100.0;
        System.out.println(" ");
        System.out.println("Thank you for coming today! You got a " + roundedScore + "%. Okay! We will be back after the break to reveal the lucky prize!!");
        
    }
    // READY FUNCTION
    public void readyFunction() 
    {
        String ready="";
        
        Scanner input= new Scanner(System.in);
        while (!ready.equalsIgnoreCase("Yes"))
        {
            System.out.println("Are you ready for your question? (Yes/No)");
            ready= input.nextLine();
        }
    }
}