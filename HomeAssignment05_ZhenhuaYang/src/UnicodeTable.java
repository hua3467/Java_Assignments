/**
 * home assignment 5 Programming Exercises_1
 * 
 * @author aaronyang
 */

public class UnicodeTable {
    
    public static void main( String [] args )
    {

        int value = 32;     // create value variable with the default value of 32
        char charValue;     // create charValue to save the Character associated with value. 

        // print the top boarder of the table
        System.out.println("_____________________________________________________" + 
                "______________________________________");
        System.out.print("|");
        
        // print the header of the table
        for( int i = 0; i < 5; i++ )
        {
            System.out.printf( "%6s  |%6s  |", "Value", "Char" );
        }
        
        // print the horizantal lines of the table 
        System.out.println();
        System.out.println("----------------------------------------------------" + 
                "---------------------------------------");
        
        // for loop to print each value and charValue
        for( int i = 0; i < (128-32)/5; i++ )
        {
            for( int j = 0; j < 5; j++ )    // nested for loop printing five values and charValues per line
            {
                charValue = (char)value;
                System.out.printf( "%6s   %6s   ", value, charValue );
                value ++;
            }       // end nested for loop
            
            // print the horizantal lines of the table
            System.out.println("\n-----------------------------------------------------" + 
                "--------------------------------------");
        }   // end outer for loop
    }
}
