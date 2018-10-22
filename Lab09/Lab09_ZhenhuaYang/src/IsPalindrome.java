import java.util.Scanner;

public class IsPalindrome
{
    public static void main( String [] args )
    {

        String word = "";   // the variable that will save the user input
        String result = ""; // the variable that save the result

        // instantiate the Scanner object 
        Scanner input = new Scanner( System.in );

        // do...while loop to perform the operation
        do {
            System.out.print( "Please enter your word, or enter 0 to exit> " );
            word = input.next();

            if( word.equals("0"))
                break;
            
            // check each character in the input word
            for( int i = 0; i < word.length() / 2; i++ )
            {
                if( word.charAt(i) != word.charAt(word.length() - 1 - i))
                    result = "not a palindrome";   
                else
                    result = "a palindrome"; 
            }

            // print out the result
            System.out.println("It is " + result + "\n" );

        }while ( word.length() != 0 );
        // end the do...wihle loop
    }
}
