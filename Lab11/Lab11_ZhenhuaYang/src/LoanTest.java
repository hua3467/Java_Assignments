/**
 *
 * @author aaronyang
 */

import java.util.Scanner;

public class LoanTest {
    public static void main( String [] args ){

        // create instant variables
        String tryAgain = "";
        int month;
        int day;
        int year;
        
        // create Loan object
        Loan newLoan = new Loan();
        
        // create Scanner object
        Scanner input = new Scanner( System.in );
 
        // prompt user input and print the result in a do while loop
        do{
        
        // ask users to input interest rate
        System.out.print( "Annual interest rate> ");
        newLoan.setAIR(input.nextDouble()); // set the interest rate to the newLoan
        
        // ask users to input number of years
        System.out.print( "Number of years the loan will be held > ");
        newLoan.setYears(input.nextInt());  // set the year to the newLoan
        
        // ask users to input the loan amount
        System.out.print( "Loan amount > ");
        newLoan.setAmount(input.nextInt()); // set the loan amount to the newLoan
        
        // ask users to input start date
        System.out.print( "Start month, day and year followed by an enter for each> \n");
        // set month, day and year to the newLoan
        month = input.nextInt();
        day = input.nextInt();
        year = input.nextInt();
        newLoan.setDate(month, day, year);
        
        // print the information of newLoan
        System.out.println( newLoan.toString());
        
        // ask users to input YES to try again or any key to exit
        System.out.print("\nPlease enter YES to try again or any key to exit>  ");
        tryAgain = input.next();
        
        } while ( tryAgain.equals("YES") );     // end do while loop
        
        System.out.println("\n\n========Thank you for trusting our loan company========\n");
    }
}
