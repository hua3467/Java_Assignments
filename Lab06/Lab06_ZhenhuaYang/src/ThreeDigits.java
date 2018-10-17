/**
 *
 * @author aaronyang
 */
import java.util.Scanner;

public class ThreeDigits 
{
    public static void main( String [] args )
    {
        // create primary varialbles for this application
        int numEntered = 932;
        int digit1;
        int digit2;
        int digit3;
        
        // instantiate a Scanner object
        Scanner input = new Scanner( System.in );
        
        // collet user's input from keyboard
        System.out.print( "Please enter a three-digit integer between 100 and 999 > ");
        numEntered = input.nextInt();
        
        // initialize each of the digits from the entered number
        digit1 = numEntered / 100;
        digit2 = ( numEntered - ( digit1 * 100 ) )/ 10;
        digit3 = numEntered % 10;
        
        // calculate the sum of three digits
        int sum = digit1 + digit2 + digit3;
        
        // print out the result
        System.out.println( "\nthe sum is: " + sum );
    }
}
