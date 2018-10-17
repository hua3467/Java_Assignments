/**
 *
 * @author aaronyang
 */
import java.util.Scanner;

public class LeapYear 
{
    public static void main( String[] args )
    {
        // create a variable to store user's inupt.
        int year;
        
        // create a Scanner object;
        Scanner input = new Scanner( System.in );
        
        // read the year from keyboard and assign it to "year"
        System.out.print( "Please enter a year> " );
        year = input.nextInt();
        
        
        if( year % 4 == 0 || year % 400 == 0 ) //If the year is divisible by 4 and not divisible by 100, 
                                                //or if the year is divisible by 400 

        {
            System.out.println( year + " is a leap year. " );
        } else if( year < 1528 )                // if the year is less than 1528
        {
            System.out.println( "the year the Gregorian calendar was adopted.");
        } else
            System.out.println( year + " is not a leap year. ");
    }   // end if
}
