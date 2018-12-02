
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
public class HourlyEmployee extends Employee {
    
    private double wage;
    private int hours;
    
    DecimalFormat currency = new DecimalFormat("$0.00");
    
    public HourlyEmployee(String newFirstName, String newLastName, 
            String newSSN, double newWage, int newHours){
        
        super( newFirstName,  newLastName, newSSN);
        wage = newWage;
        hours = newHours;
        
    }
    
    public double getWage(){
        return wage;
    }
    public int getHours(){
        return hours;
    }
    
    public void setWage( double newWage ){
        if(newWage>=0){
            wage = newWage;
        }else{
            throw new IllegalArgumentException( "the new Wage should not be negative." );
        }
    }
    public void setHours( int newHours ){
        if( newHours >= 0 ){
            hours = newHours;
        }else{
            throw new IllegalArgumentException("the number of hours should not be negative");
        }
    }
    
    @Override
    public double getEarnings(){
        if( getHours() > 40 )
            return ( getWage() * 40 ) + ( getWage() * ( getHours() - 40) * 1.5 );
        else
            return getWage() * getHours();
    }
    
    @Override
    public String toString(){
        return super.toString() + "\tEmployee Type: Hourly" + ", \tWorking Hours: " + getHours()
                + "\twage: " + currency.format(getWage()) + "\tEarnings: " + currency.format(this.getEarnings());      
    }
    
    @Override
    public boolean equals( Object o ){
        if( !( o instanceof HourlyEmployee ) )
            return false;
        else{
            HourlyEmployee objH = (HourlyEmployee) o;
            return this.getWage() == objH.getWage() &&
                    this.getHours() == objH.getHours();
        }
    }
    
}
