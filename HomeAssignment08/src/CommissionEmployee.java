
import java.text.DecimalFormat;

/**
 *
 * @author zhenhua.yang.1
 */
public class CommissionEmployee extends Employee {
    
    // create instance variables
    private double grossSales;
    private double commissionRate;
    
    // create DecimalFormat object currency
    DecimalFormat currency = new DecimalFormat("$0.00");
    /**
     * constructor
     * @param newFirstName
     * @param newLastName
     * @param newSSN
     * @param newGrossSales
     * @param newCommissionRate 
     */
    public CommissionEmployee(String newFirstName, String newLastName, 
            String newSSN, double newGrossSales, double newCommissionRate){
        
        super( newFirstName,  newLastName, newSSN);
        grossSales = newGrossSales;
        commissionRate = newCommissionRate;
        
    }
   // accessor methods
    public double getGrossSales(){
        return grossSales;
    }
    public double getCommissionRate(){
        return commissionRate;
    }
    
    // mutator methods
    public void setGrossSales( double newGrossSales ){
        grossSales = newGrossSales;
    }
    public void setCommissionRate( double newCommissionRate ){
        commissionRate = newCommissionRate;
    }
    
    public String toString(){
        return super.toString() + "\tEmployee Type: Commission" + ", \tGross Sales: " + currency.format(getGrossSales())
                + "\tCommission Rate: " + currency.format(getCommissionRate()) + "\tEarnings: " + currency.format(this.getEarnings());
    }
    
    @Override
    public boolean equals( Object o ){
        if( ! ( o instanceof CommissionEmployee ))
            return false;
        else{
            CommissionEmployee objC = (CommissionEmployee)o;
            return super.equals(objC) 
                    && this.getGrossSales() == objC.getGrossSales() 
                    && this.getCommissionRate() == objC.getCommissionRate();
        }
            
    }
    
    public double getEarnings(){
        return commissionRate * grossSales;
    }
    
}
