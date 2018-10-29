import java.util.Scanner;
import java.text.DecimalFormat;

public class Deposit
{
    public static void main( String [] args )
    {
        final double INT = .1;
        double total = 0;
        int year;
        double initialAmount;

        Scanner input = new Scanner( System.in );

        do {
            System.out.println( "Please enter following data or -1 to exit \n");

            System.out.print("Please enter your initial amount:> ");
            initialAmount = input.nextDouble();

            if( initialAmount == -1 )
            {
                System.out.println("\n==Thank you for using this app. Bye.==\n");
                break;
            }

            System.out.print("How many years do you want to save? > ");
            year = input.nextInt();
            
            if( year == -1 )
            {
                System.out.println("\n==Thank you for using this app. Bye.==\n");
                break;
            }

            DecimalFormat decimal = new DecimalFormat("#.##");

            total = initialAmount * Math.pow( (1 + INT), year );

            System.out.println("The total balance at the end is: " + decimal.format(total) );
            
            double total2 = initialAmount * Math.pow( ( 1 + INT ), year + 1 );
            double monthlyIncome = (((INT / 12) * total2) / ( 1 - ( Math.pow ( 1 / (1 + INT), 12 * year))));
            
            System.out.println("\nThe total balance after "  + (year + 1) + " years is: " 
                            + decimal.format(total2)  
                            + "\nThe interest earned during this year is " + decimal.format(total * INT) 
                            + "\nMonthly income is " + decimal.format(monthlyIncome) 
                            + "\n *** \n");
            
        } while ( initialAmount !=-1 );
    }
}

