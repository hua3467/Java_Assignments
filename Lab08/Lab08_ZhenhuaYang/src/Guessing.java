/**
 *
 * @author zhenhua.yang.1
 */

import java.util.Random;
import java.util.Scanner;

public class Guessing 
{
    public static void main( String[] args )
    {
        // create variables and assign initial value of 1 to count
        int num;
        int count = 1; 
        int guessNum;

        
        Random rand = new Random();                 // instantiate Random object
        num = rand.nextInt(100) + 1;                // assign a random number from 1-100 to num

        Scanner input = new Scanner( System.in );   // instantiate Scanner object
        
        System.out.print("Please guess a number, or enter -1 to exit>  ");
        guessNum = input.nextInt();                 // save user input from keyboard

        while( guessNum != num )
        {
            // if the user enters -1, the loop would stop and this count would be ignored. 
            if( guessNum == -1 )
            {
                count--;                
                break;
            }
            // guess does not equal to num, user inputs another ingeter, 
            // and count increments for 1. 
            System.out.print( "Not that number, try another number, or enter -1 to exit> " );
            guessNum = input.nextInt();
            count ++;  
        }   // end while statement. 
        
        if ( guessNum == num )
            System.out.println( "\nAwesome! You found the right number with " + count + " tries!" );
        else{
        System.out.println( "\nThe number is " + num );
        System.out.println( "You tried " + count + " times. " );
        }
    }
}
