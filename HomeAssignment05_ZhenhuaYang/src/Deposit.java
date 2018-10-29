import java.util.Scanner;
import java.text.DecimalFormat;

public class Deposit
{
    public static void main( String [] args )
    {
        // Create viariables
        final double INT = .1;
        double total = 0;
        int year;
        double initialAmount;

        // Instantiate Scanner object
        Scanner input = new Scanner( System.in );

        // Start do...while loop
        do {
            System.out.println( "Please enter following data or -1 to exit \n");

            // Ask user to enter initial amount
            System.out.print("Please enter your initial amount:> ");
            initialAmount = input.nextDouble();
            
            // exit case
            if( initialAmount == -1 )
            {
                System.out.println("\n==Thank you for using this app. Bye.==\n");
                break;
            }

            // Ask user to enter the number of years
            System.out.print("How many years do you want to save? > ");
            year = input.nextInt();
           
            // exit case
            if( year == -1 )
            {
                System.out.println("\n==Thank you for using this app. Bye.==\n");
                break;
            }

            // create the DecimalFormat object.
            DecimalFormat decimal = new DecimalFormat("#.##");

            // calculate the total amount of money over the number of years user entered
            total = initialAmount * Math.pow( (1 + INT), year );

            // print the total balance
            System.out.println("The total balance at the end is: " + decimal.format(total) );
            
            // the total balance at year + 1 
            double total2 = initialAmount * Math.pow( ( 1 + INT ), year + 1 );
            
            // the monthly income after 61 years old.
            double monthlyIncome = (((INT / 12) * total2) / ( 1 - ( Math.pow ( 1 / (1 + INT), 12 * year))));
            
            System.out.println("\nThe total balance after "  + (year + 1) + " years is: " 
                            + decimal.format(total2)  
                            + "\nThe interest earned during this year is " + decimal.format(total * INT) 
                            + "\nMonthly income is " + decimal.format(monthlyIncome) 
                            + "\n *** \n");
            
        } while ( initialAmount !=-1 );     // end while loop
    }
}

