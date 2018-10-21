/**
 *
 * @author zhenhua.yang.1
 */
import java.util.Scanner;

public class XorSimulation 
{
    public static void main( String[] args )
    {
        char result;
        char input2;
        String input;
        
        Scanner scan = new Scanner( System.in );
        
        System.out.print("Please enter your value> ");
        input = scan.next();  
       
        // assume 101
         result = input.charAt(0);
         
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
        
        System.out.println( "The result is " + result ); 
        
    }
   
}
