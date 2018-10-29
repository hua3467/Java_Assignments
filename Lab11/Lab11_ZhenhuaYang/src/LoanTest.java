/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaronyang
 */

import java.util.Scanner;

public class LoanTest {
    public static void main( String [] args ){
        
        Loan newLoan = new Loan();
        
        Scanner input = new Scanner( System.in );
        
        System.out.print( "Annual interest rate> ");
        newLoan.setAIR(input.nextDouble());
        
        System.out.print( "Number of years the loan will be held > ");
        newLoan.setYears(input.nextInt());
        
        System.out.print( "Loan amount > ");
        newLoan.setAmount(input.nextInt());
        
        System.out.print( "Start date of the loan (mm/dd/yyyy)> ");
        newLoan.setDate(input.next());
        

        System.out.println( newLoan.toString() );
    }
}
