
import java.text.DecimalFormat;
/**
 *
 * @author zhenhua.yang.1
 */
public class SalariedEmployee extends Employee {
    
    // instance variable
    private double weeklySalary;
    
    DecimalFormat currency = new DecimalFormat("$0.00");
    
    /**
     * constructor that allow the application create an SalariedEmployee object. 
     * @param newFirstName
     * @param newLastName
     * @param newSSN
     * @param newWeeklySalary 
     */
    public SalariedEmployee(String newFirstName, String newLastName, String newSSN, 
            double newWeeklySalary ){
        
        super( newFirstName,  newLastName, newSSN);
        weeklySalary = newWeeklySalary;
    }
    
    // accessor method
    public double getWeeklySalary(){
        return weeklySalary;
    }
    
    // mutator method
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
            return super.equals(objS)
                    && this.getWeeklySalary() == objS.getWeeklySalary();
        }
            
    }

    @Override
    public double getEarnings() {
        return getWeeklySalary();
    }
    
    
    
}
