/*  Printing numbers using nested for loops
    Anderson, Franceschi
*/

public class NestedForLoops
{
  public static void main( String [] args )
  {
     // outer for loop prints 5 lines
     for ( int line = 1; line <= 5; line++ )
     {
       // inner for loop prints one line
       for ( int number = 1; number <= line; number++ )
       {
         // print the number and a space
         System.out.print( number + " " );
       }

       System.out.println( );    // print a newline
     }
  }
}

/* Output:
 * run:
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
BUILD SUCCESSFUL (total time: 0 seconds)
 */