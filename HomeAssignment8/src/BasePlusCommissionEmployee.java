/**
 *
 * @author zhenhua.yang.1
 */
import java.text.DecimalFormat;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;
    
    DecimalFormat currency = new DecimalFormat("$0.00");
    
    public BasePlusCommissionEmployee(String newFirstName, String newLastName, String newSSN, 
            double newGrossSales, double newCommissionRate, double newBaseSalary){
        
        super( newFirstName, newLastName, newSSN, newGrossSales, newCommissionRate );
        
        baseSalary = newBaseSalary;
    }
    
    public double getBaseSalary(){
        return baseSalary;
    }
    public void setBaseSalary( double newBaseSalary ){
        if( newBaseSalary >= 0 )
            baseSalary = newBaseSalary;
        else
            throw new IllegalArgumentException( "the base salary should not be negative" );
    }
    
    public String toString(){
        return super.toString() + "\tEmployee Type: Base+Commission" + ", \tBase Salary: " + 
                currency.format(getBaseSalary())  + "\tEarnings: " + currency.format(this.getEarnings());
    }
    
    public double getEarnings(){
        return (getCommissionRate() * getGrossSales()) + baseSalary;
    }
}
