/**
 *
 * @author zhenhua.yang.1
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class InvestmentCalc
{
    public static void main( String [] args )
    {
        double interestRate;
        double futureValue;
        double investment;
        int years;
        
        Scanner input = new Scanner( System.in );
        
        System.out.print( "Investment: " );
        investment = input.nextDouble();
        
        System.out.print( "Interest Rate: " );
        interestRate = input.nextDouble();
        
        System.out.print( "Year: " );
        years = input.nextInt();
        
        futureValue = investment * Math.pow(interestRate, years);
        
        System.out.println( futureValue );
    }
}
