/**
 *
 * @author aaronyang
 */
import java.util.Scanner;
import java.text.NumberFormat;

public class MonthlyMortgagePayment 
{
    public static void main( String [] args )
    {
        // Create three primary variables
        double yIR;
        int nOY;
        double m;
        
        // Instantiate a Scanner object
        Scanner scan = new Scanner( System.in );
        
        // Collect data input from keyboard
        System.out.print( "Annual Interest tate: " );
        yIR = scan.nextDouble();
        
        System.out.print( "Number of years of mortgage: " );
        nOY = scan.nextInt();
        
        System.out.print( "Mortgae amount: ");
        m = scan.nextDouble();
        
        // Calculate the monthly rate, monthly payment, total payment, over payment, 
        // and the percentage of the over payment. 
        double mIR = yIR / 12;
        double mPay = ( mIR * m )/( 1 - ( 1 / Math.pow(( 1 + mIR), (12*nOY)) ) );
        double yPay = mPay * 12 * nOY;
        double oPay = yPay - m;
        double oPayP = oPay / m;
        
        // instantiate a NumberFormat object specifying a pattern for percentage
        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        // instantiate a NumberFormat object specifying a pattern for currency
        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance();
        
        // Print the mortgage summary
        System.out.println( "\n\n=============Mortgage Summary==============\n" + 
                "\n-Annual interest rate: " + percentFormat.format(yIR) + 
                "\n-Mortgage amount: " + dollarFormat.format(m) +
                "\n-Monthly payment: " + dollarFormat.format(mPay) +
                "\n-Total payment over the years: " + dollarFormat.format(yPay) + 
                "\n-Over payment: " + dollarFormat.format(oPay) + 
                "\n-Over payment in a percentage: " + percentFormat.format(oPayP) + "\n");
        
    }
}
