import java.util.Scanner;
import java.util.Arrays;

public class Connections
{
    private static final String[] currentWords = {"ME", "THEM", "US", "YOU","CHEER", "FESTIVITY", "GLEE", "MIRTH","ALLEY", "BALL", "LANE", "PIN","BOND", "CD", "OPTION", "STOCK"};
    private static final String[] group1 = {"ME", "THEM", "US", "YOU"}; // sorted!
    private static final String[] group2 = {"CHEER", "FESTIVITY", "GLEE", "MIRTH"}; // sorted!
    private static final String[] group3 = {"ALLEY", "BALL", "LANE", "PIN"}; // sorted!
    private static final String [] group4= {"BOND", "CD", "OPTION", "STOCK"};
    private static final String GUESSED = "----";
    private static Scanner scanner = new Scanner(System.in);

    // Names of you / your partner:
    // 
    
    public static void main(String[] args)
    {
        System.out.println("Welcome to Connections!");
        shuffleArray(currentWords);

        
        while (true){
            printArrayOnFourLines(currentWords);
            String [] guesses= getGuesses();
            boolean match= checkIfMatchesGroup(guesses);


    
            if (match){
                System.out.println("That's a group!");
                updateCurrentWords(currentWords, guesses);
                // printArrayOnThreeLines(currentWords);
            }
           
            else{
                System.out.println("That's not a group. Please try again.");
                continue;
            }
            if(allStringsMatch(currentWords, GUESSED)){
                System.out.println("Congrats! You completed today's connections.");
                break;
                
            }
    }
        }
        
    public static boolean allStringsMatch(String[] array, String target) {
        for (String str : array) {
            if (!str.equals(target)) {
                return false; // Return false if any string does not match the target
            }
        }
        return true; // If loop completes, all strings match the target
    }

    
    private static void updateCurrentWords(String[] currentWords, String[] groupToRemove) {
    
        for (String word : groupToRemove){
            for (int i = 0;i< currentWords.length; i++){
                if (currentWords[i].equals(word)){
                    currentWords[i] = "----";
                    break;    
                } 
            }
        }
    }


    
    private static String[] getGuesses() {
        String[] userGroup;
        while ( true ) {
            System.out.println("Enter your four guesses with a space in between: ");
            String userInput = scanner.nextLine();
            userGroup = userInput.split(" ");
            if ( userGroup.length != 4 ) {
                System.out.println("Invalid input. You must enter three words.");
            }
            else {
                break;
            }
        }
        return userGroup;
    }
    

        
    private static boolean checkIfMatchesGroup(String[] guesses) {
            //update to uppercase
            for(int i = 0; i<4; i++) {
                guesses[i] = guesses[i].toUpperCase();
            }
    
            //check if equal
            Arrays.sort(guesses);
            if (Arrays.equals(guesses, group1)) {
                return true;
            }
            if (Arrays.equals(guesses, group2)) {
                return true;
            }
            if (Arrays.equals(guesses, group3)) {
                return true;
            }
            if (Arrays.equals(guesses, group4)) {
                return true;
            }
            return false;
        }


    
    private static void shuffleArray(String[] array)
    {
        for (int i=0; i<array.length; i++)
        {
            int random= (int)(Math.random()*array.length);
            String temp= array[random];
            array[random]= array[i];
            array[i]= temp;
        }
    }
    
    public static void printArrayOnFourLines(String[] array) {
        int elementsPerLine = 4;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");

            // Move to the next line after printing each group of 3 elements
            if ((i + 1) % elementsPerLine == 0) {
                System.out.println();
            }
        }
    }

}