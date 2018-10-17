/*  Addition Calculator
    Anderson, Franceschi
*/

import java.util.Scanner;

public class Calculator
{
   public static void main( String [] args )
   {
     final int SENTINEL = 0;
     int number;
     int total = 0;

     Scanner scan = new Scanner( System.in );

     System.out.println( "Welcome to the addition calculator.\n" );

     System.out.print( "Enter the first number"
                        + " or 0 for the total > " );
     number = scan.nextInt( );

     while ( number != SENTINEL )
     {
        total += number;

        System.out.print( "Enter the next number"
                           + " or 0 for the total > " );
        number = scan.nextInt( );
     }

     System.out.println( "The total is " + total );
   }
}

/* output -
 * run:
Welcome to the addition calculator.

Enter the first number or 0 for the total > 10
Enter the next number or 0 for the total > 20
Enter the next number or 0 for the total > 30
Enter the next number or 0 for the total > 0
The total is 60
BUILD SUCCESSFUL (total time: 10 seconds)
 */