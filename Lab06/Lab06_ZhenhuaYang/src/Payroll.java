/**
 *
 * @author zhenhua.yang.1
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Payroll
{
    public static void main ( String [] args )
    {
        
        // create primary varialbles for this application
        String employee;
        int hoursWorked;
        double hourlyPay;
        double federalTaxRate;
        double stateTaxRate;
        
        // instantiate a Scanner object
        Scanner scan = new Scanner( System.in );
        
        // collecting user's input from keyboard
        System.out.print( "Emoyee's name > ");
        employee = scan.next();
        
        System.out.print( "Number of hours worked in a week >");
        hoursWorked = scan.nextInt();
        
        System.out.print( "Hourly Rate > " );
        hourlyPay = scan.nextDouble();
        
        System.out.print( "Federal tax withholding rate >");
        federalTaxRate = scan.nextDouble();
        
        System.out.print( "State tax withholding rate > " );
        stateTaxRate = scan.nextDouble();
        
        // based on the data entered, calculate gross pay, federal tax, state tax and net income
        double grossPay = hoursWorked * hourlyPay;
        double federalTax = grossPay * federalTaxRate;
        double stateTax = grossPay * stateTaxRate;
        double netIncome = grossPay - federalTax - stateTax;
        
        // instantiate a DecimalFormat object specifying a pattern for currency
        DecimalFormat rateFormat = new DecimalFormat( "$#0.00" );
        
        // instantiate a DecimalFormat object specifying a pattern for percentage
        DecimalFormat percFormat = new DecimalFormat( "#0%" );
        
        // print the payroll statement
        System.out.println( "\n\n==============Payroll=================\n" + 
                "\n-Employee's Name: " + employee + 
                "\n-Number of hours worked in a week: " + hoursWorked + 
                "\n-Hourly Pay: " + rateFormat.format(hourlyPay) +
                "\n-Federal tax withholding rate: " + percFormat.format(federalTaxRate) +
                "\n-State tax withholding rate: " + percFormat.format(stateTaxRate) +
                "\n-Gross Pay: " + rateFormat.format(grossPay) + 
                "\n-Federal tax withholding: " + rateFormat.format(federalTax) +
                "\n-State tax withholding: " + rateFormat.format(stateTax) +
                "\n-Net Income: " + rateFormat.format(netIncome) + "\n");
        
    }
}
