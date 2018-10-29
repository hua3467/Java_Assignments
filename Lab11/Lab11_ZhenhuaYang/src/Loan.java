/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaronyang
 */
public class Loan {
    
    private double air;
    private int years;
    private int amount;
    private String loanDate;
    
    public Loan(){
        air = 0.0;
        years = 0;
        amount = 0;
        loanDate = null;
    }
    
    public Loan( double newAIT, int newYear, int newAmount, Date newDate){
        air = newAIT;
        years = newYear;
        amount = newAmount;
        loanDate = newDate.toString();
    }
    
    public double getAIT(){
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
    
    
    public void setAIR( double newAIR ){
        air = newAIR;
    }
    public void setAmount( int newAmount ){
        amount = newAmount;
    }
    public void setYears( int newYears ){
        years = newYears;
    }
    public void setDate( String newDate ){
        // how to create a Date object? 
        loanDate = newDate;
    }

    public int monthlyPayment(){
        
        double mir = air / 12;
        return (int) ((mir * amount) / ( 1 - ( Math.pow ( 1 / (1 + mir), 12 * years))));
    }
    
    public int totalPayment(){
        
        int total = 0;
        return total;
    }
    
    public int overPayment(){
        
        return this.totalPayment() - amount;
        
    }
    
    @Override
    public String toString(){
        
        return "===================Loan Information====================" 
                + "\n\nAnnual Interest Rate: " + air
                + "\nNumber of Years: " + years
                + "\nLoan Amount: " + amount
                + "\nLoan Date: " + loanDate
                + "\n\n========Thank you for trusting our loan company========";

    }
}
