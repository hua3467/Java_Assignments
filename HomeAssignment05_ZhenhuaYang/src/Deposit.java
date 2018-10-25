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
            System.out.println( "Please enter following data or -1 to exit");

            System.out.print("Please enter your initial amount:> ");
            initialAmount = input.nextDouble();

            if( initialAmount == -1 )
                break;

            System.out.print("How many years do you want to save? > ");
            year = input.nextInt();

            DecimalFormat decimal = new DecimalFormat("#.##");

            total = initialAmount * Math.pow( (1 + INT), year );

            System.out.println("The total balance at the end is: " + decimal.format(total) + "\n" );
            
        } while ( initialAmount !=-1 );
    }
}

