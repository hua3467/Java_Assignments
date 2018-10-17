/**
 *
 * @author zhenhua.yang.1
 */
import java.util.Scanner;

public class Triangle 
{
    public static void main( String [] args )
    {
        // create three variables to store the length of edges
        int a;
        int b;
        int c;

        // create Scanner object
        Scanner input = new Scanner(System.in);

        // read inputs from keyboard and assign them to each edge.
        System.out.print( "Please enter the length of the first edge: ");
        a = input.nextInt();
        
        System.out.print( "Please enter the length of the second edge: ");
        b = input.nextInt();
        
        System.out.print( "Please enter the length of the third edge: ");
        c = input.nextInt();
        
        // test if the inputs are valid
        
        if( ( a + b ) > c && ( a + c > b ) && ( b + c > a ) )
        {
            int perimeter = a + b + c;
            System.out.println( "The inputs are valid as sum of any two edges is" +
                    " greater than the third edge, and the perimeter of this triangle is " + 
                    perimeter );
        }
        else
            System.out.println( "The inputs are invalid as sum of two edges is less than or equal to the third edge." );
        // end if
    }
}