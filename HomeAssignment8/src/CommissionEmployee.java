/**
 *
 * @author zhenhua.yang.1
 */
public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;
    
    public CommissionEmployee(String newFirstName, String newLastName, 
            String newSSN, double newGrossSales, double newCommissionRate){
        super( newFirstName,  newLastName, newSSN);
        grossSales = newGrossSales;
        commissionRate = newCommissionRate;
    }
    
    public double getGrossSales(){
        return grossSales;
    }
    
    public double getCommissionRate(){
        return commissionRate;
    }
    
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
    
    public double getEarnings(){
        return commissionRate * grossSales;
    }
    
}
