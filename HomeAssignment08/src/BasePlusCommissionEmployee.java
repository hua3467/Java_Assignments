/**
 *
 * @author zhenhua.yang.1
 */
import java.text.DecimalFormat;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    
    // instance variable
    private double baseSalary;
    
    // create DecimalFormat object currency
    DecimalFormat currency = new DecimalFormat("$0.00");
    
    /**
     * constructor that create an BasePlusCommissionEmployee object
     * @param newFirstName
     * @param newLastName
     * @param newSSN
     * @param newGrossSales
     * @param newCommissionRate
     * @param newBaseSalary 
     */
    public BasePlusCommissionEmployee(String newFirstName, String newLastName, String newSSN, 
            double newGrossSales, double newCommissionRate, double newBaseSalary){
        
        super( newFirstName, newLastName, newSSN, newGrossSales, newCommissionRate );
        
        baseSalary = newBaseSalary;
    }
    
    // accessor methods
    public double getBaseSalary(){
        return baseSalary;
    }
    public void setBaseSalary( double newBaseSalary ){
        if( newBaseSalary >= 0 )
            baseSalary = newBaseSalary;
        else
            throw new IllegalArgumentException( "the base salary should not be negative" );
    }
    
    /**
     * getEearning() method that returns the employee's earning.
     * @return a double value that represents total earning
     */
    public double getEarnings(){
        return (getCommissionRate() * getGrossSales()) + baseSalary;
    }
    
    public String toString(){
        return super.toString() + "\tEmployee Type: Base+Commission" + ", \tBase Salary: " + 
                currency.format(getBaseSalary())  + "\tEarnings: " + currency.format(this.getEarnings());
    }
    
    public boolean equals( Object o ){
        
        if( !( o instanceof BasePlusCommissionEmployee ))
            return false;
        else{
            BasePlusCommissionEmployee objH = (BasePlusCommissionEmployee) o;
            return super.equals(objH) 
                    && this.getEarnings() == objH.getEarnings() 
                    && baseSalary == objH.baseSalary;
        }
        
    }
    
}
