
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zhenhua.yang.1
 */
public class SalariedEmployee extends Employee {
    private double weeklySalary;
    
    DecimalFormat currency = new DecimalFormat("$0.00");
    
    public SalariedEmployee(String newFirstName, String newLastName, String newSSN, 
            double newWeeklySalary ){
        
        super( newFirstName,  newLastName, newSSN);
        weeklySalary = newWeeklySalary;
    }
        
    public double getWeeklySalary(){
        return weeklySalary;
    }
    
    public void setWeeklySalary( double newWeeklySalary ){
        if( newWeeklySalary >= 0 )
            weeklySalary = newWeeklySalary;
        else
            throw new IllegalArgumentException("the weekly salary should not be negative");
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return super.toString() + "\tEmployee Type: Salaried" + ", \tWeekly Salary: " + 
                currency.format(getWeeklySalary()) + "\tEarnings: " + currency.format(this.getEarnings());
    }
    
    @Override
    public boolean equals( Object o ){
        if( ! ( o instanceof SalariedEmployee ))
            return false;
        else{
            SalariedEmployee objS = (SalariedEmployee)o;
            return this.getWeeklySalary() == objS.getWeeklySalary();
        }
            
    }

    @Override
    public double getEarnings() {
        return getWeeklySalary();
    }
    
    
    
}
