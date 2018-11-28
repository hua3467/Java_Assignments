/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zhenhua.yang.1
 */
public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;
    
    private double getGrossSales(){
        return grossSales;
    }
    
    private double getCommissionRate(){
        return commissionRate;
    }
    
     @Override
    public String toString(){
        return "Gross Sales: " + getGrossSales()
                + "\nCommission Rate: " + getCommissionRate();
    }
    
    @Override
    public boolean equals( Object o ){
        if( ! ( o instanceof CommissionEmployee ))
            return false;
        else{
            CommissionEmployee objC = (CommissionEmployee)o;
            return this.getGrossSales() == objC.getGrossSales() && 
                    this.getCommissionRate() == objC.getCommissionRate();
        }
            
    }
    
}
