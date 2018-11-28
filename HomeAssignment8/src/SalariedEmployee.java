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
    
    private double getWeeklySalary(){
        return weeklySalary;
    }
    
    private void setWeeklySalary( double newWeeklySalary ){
        weeklySalary = newWeeklySalary;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return "The employee's weekly salary is " + getWeeklySalary();
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
