
/**
* A guessing game where the user tries to guess a random number between 1 and 10. 
* The user has three tries to "win" by guessing correctly.
* 
* @Diza
*/
import java.util.*;

public class guessingGame
{

public static void main(String args[]){
{

    int rnd; //random
    int guessInt = 0;
    int response;
    int game = 0; //game is "unfinished" at 0, "finished" at 1
    
    while (game == 0) {
        System.out.println("Welcome to the magical, mystical guessing game!");
        System.out.println("Please guess a number between 1 and 10.");
        
        int max = 10;
        int min = 1;
        rnd = (int)(Math.random() * ((max - min) + 1)) + min; //randomizes integer between 1 and 10, inclusive
                
        int counter = 0; //the number of times the user has guessed
        while (counter < 3 && rnd != guessInt) {
            Scanner scan = new Scanner(System.in);
            guessInt = scan.nextInt(); //sets user input to value of guessed integer
            counter++;
            if (rnd == guessInt) { //compares guessed integer to randomized integer
                System.out.println("Winner!");
            }
            else if (rnd != guessInt) {
                System.out.println("Sorry, Wrong");
            }
        }
        game = 1; //sets game to finished, waits for user input
        System.out.println("Press 1 to play again! Press 2 to quit the program.");
        Scanner scan2 = new Scanner(System.in);
        response = scan2.nextInt();
        if (response == 1) {
            game = 0; //game is set to unfinished, and will restart
        }
        else if (response == 2){
            System.exit(0); //program quits
        }
    }
    }
}
}

