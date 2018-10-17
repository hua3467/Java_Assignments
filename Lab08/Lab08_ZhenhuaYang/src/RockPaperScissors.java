/**
 *
 * @author zhenhua.yang.1
 */

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors 
{
    public static void main( String [] args )
    {
        // create variables 
        int userOption;
        int computerOption;
        
        Random rand = new Random();                 // instantiate Random object

        Scanner input = new Scanner( System.in );   // instantiate Scanner object
        
        System.out.println( "1 = Rock \n2 = Paper \n3 = Scissors" );    // print options for the user
        System.out.print( "Please enter your option, or enter 0 to exit > ");                                       
       
        // while loop
        while( true )
        {   
            userOption = input.nextInt();               // save user input from keyboard
            computerOption = rand.nextInt(3) + 1;       // assign a random number from 1-100 to computerOption
            while( userOption > 3 || userOption < 0)
            {
                System.out.print( "Please select from 0, 1, 2, and 3 > ");  // if the user enters a number other then 0 - 3
                userOption = input.nextInt();
            }
            if ( (computerOption == 1 && userOption == 2)
                    || (computerOption == 2 && userOption == 3)
                    || (computerOption == 3 && userOption == 1) )           // the condition that Computer wins
                System.out.print( "Computer wins. \nPlease enter your option, or enter 0 to exit > " );
            
            if( computerOption == userOption )                         // the considition that ties
                System.out.print( "Ties. \nPlease enter your option, or enter 0 to exit > " );

            if( (userOption == 1 && computerOption == 2)
                    || (userOption == 2 && computerOption == 3)
                    || (userOption == 3 && computerOption == 1) )      // the conditions that the user wins
                System.out.print( "You win. \nPlease enter your option, or enter 0 to exit > " );
            
            if ( userOption == 0 )      // the condition that the user stoped game
            {
                System.out.println( "\nGoodbey!" );
                break;                  // terminate the while loop
            }
        }
    }   
}
