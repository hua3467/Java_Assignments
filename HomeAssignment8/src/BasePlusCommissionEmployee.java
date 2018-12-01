/**
 *
 * @author zhenhua.yang.1
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;
    
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
        return "Base Salary: " + getBaseSalary();
    }
    
    public double getEarnings(){
        return (getCommissionRate() * getGrossSales()) + baseSalary;
    }
}
