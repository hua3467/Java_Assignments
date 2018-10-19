/**
 *
 * @author zhenhua.yang.1
 */
import java.util.Scanner;

public class XorSimulation 
{
    public static void main( String[] args )
    {
        char input1;
        char input2;
        String input;
        
        Scanner scan = new Scanner( System.in );
        
        System.out.print("Please enter your value> ");
        input = scan.next();  
       
        // assume 101
         input1 = input.charAt(0);
         
        for( int i = 1; i < input.length(); i++ )
        {
            input2 = input.charAt(i);

            if ( ( ( input1 == '1' || input2 == '0' ) && input1 != input2 )
                    || ( ( input1 == '0' || input2 == '1' ) && input1 != input2 ) )
                input1 = '1';
            if ( input1 == input2 )
                input1 = '0';
        }
        
        System.out.println( "The result is " + input1 ); 
        
    }
   
}
