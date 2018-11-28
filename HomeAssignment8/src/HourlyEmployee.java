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
    
    private double getWage(){
        return wage;
    }
    private int getHours(){
        return hours;
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
        return "working hours: " + hours
                + "wage: " + wage;      
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
