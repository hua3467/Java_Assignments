/**
 *
 * @author zhenhua.yang.1
 */
import java.util.Scanner;

public class XorSimulation 
{
    public static void main( String[] args )
    {
        // Create variables
        char result;
        char input2;
        String input;
        
        // Create a Scanner class object
        Scanner scan = new Scanner( System.in );
        
        // Prompt and read the input from keyboard
        System.out.print("Please enter your value> ");
        input = scan.next();  
       
        // Initiate result, set defalt value the first digit of input.
         result = input.charAt(0);
         
        // for loop to perform XOR operation
        for( int i = 1; i < input.length(); i++ )
        {
            input2 = input.charAt(i);

            if ( result == input2  )
            {
                result = '0';
            }
            else
            {
                result = '1';
            }
        }
        
        // print the result
        System.out.println( "The result is " + result ); 
        
    }
   
}
