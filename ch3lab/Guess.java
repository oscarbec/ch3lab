// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//              
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
 
public class Guess
{
    public static void main(String[] args)
        {
          int numToGuess;           //Number the user tries to guess
          int guess;                //The user's guess
          String pos = "";
 
          Scanner scan = new Scanner(System.in);
          Random generator = new Random();
          
 
          //randomly generate the  number to guess
          numToGuess = generator.nextInt(10) + 1;
 
          //print message asking user to enter a guess
          System.out.println("Guess a number between 1 and 10"); 
          guess = scan.nextInt();
          
          
          //read in guess
                    
          while (guess != numToGuess  )  //keep going as long as the guess is wrong
            {
                  if (guess > numToGuess){
                      pos = "Try Lower";
                    }
                  pos = "Try Higher";  
                  System.out.println("You're wrong guess again. " + pos);
                  guess = scan.nextInt();
                  //get another guess from the user
          }
 
          System.out.println("You guessed right");
          
        }
}