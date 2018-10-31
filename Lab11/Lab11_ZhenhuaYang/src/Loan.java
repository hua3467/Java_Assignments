/**
 *
 * @author aaronyang
 */

import java.text.DecimalFormat;

public class Loan {
    
    // instance variables 
    private double air;
    private int years;
    private int amount;
    private Date loanDate;  // create Date object
    
    // default constructor
    public Loan(){
        air = 0.0;
        years = 0;
        amount = 0;
        loanDate = null;
    }
    
    // overloaded constructor
    public Loan( double newAIR, int newYear, int newAmount, Date newDate){
        air = newAIR;
        years = newYear;
        amount = newAmount;
        loanDate = newDate;
    }
    
    // accessor methods
    public double getAIR(){
        return air;
    }
    public int getYears(){
        return years;
    }
    public int getAmount(){
        return amount;
    }
    public String getDate(){
        return loanDate.toString();
    }
    
    // mutator methods
    public void setAIR( double newAIR ){
        air = newAIR;
    }
    public void setAmount( int newAmount ){
        amount = newAmount;
    }
    public void setYears( int newYears ){
        years = newYears;
    }
    public void setDate( int m, int d, int y ){
        
        loanDate = new Date( m, d, y);
        
    }

    // calculate the monthly payment
    public double monthlyPayment(){
        
        double mir = air / 12;
        return ((mir * amount) / ( 1 - ( Math.pow ( 1 / (1 + mir), 12 * years))));
    }
    // calculate the total payment
    public double totalPayment(){
        
        // calculate total payment
        double total = amount * Math.pow( ( 1 + air ), years);
        return total;
    }
    // calculate the over payment
    public double overPayment(){
        
        return this.totalPayment() - amount;
        
    }
    
    // toString method
    @Override
    public String toString(){
        
        DecimalFormat percent = new DecimalFormat( "0.00%" );
        DecimalFormat dollar = new DecimalFormat( "$0.00" );
        
        return "===================Loan Information====================" 
                + "\nAnnual interest rate: " + percent.format(air) 
                + "\nMortgage amount: " + dollar.format(amount)
                + "\nMonthly payment: " + dollar.format(this.monthlyPayment())
                + "\nTotal payment over the years: " + dollar.format(this.totalPayment())
                + "\nOverpayment: " + dollar.format(this.overPayment())
                + "\noverpayment as a percentage: " + percent.format(this.overPayment() / this.getAmount());
    }
    
    // equals method
    public boolean equals( Object o ){
        
        if ( ! ( o instanceof Loan ) )
            return false;
        else{
            Loan objLoan = (Loan) o;
            return air == objLoan.air && amount == objLoan.amount 
                    && years == objLoan.years && loanDate == objLoan.loanDate;
        }
    }
    
}
