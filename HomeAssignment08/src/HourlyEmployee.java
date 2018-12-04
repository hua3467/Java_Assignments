
import java.text.DecimalFormat;
/**
 *
 * @author zhenhua.yang.1
 */
public class HourlyEmployee extends Employee {
    
    // create instance variables
    private double wage;
    private int hours;
    
    // create DecimalFormat object currency
    DecimalFormat currency = new DecimalFormat("$0.00");
    
    /**
     * constructor that create an HourlyEMployee object 
     * @param newFirstName
     * @param newLastName
     * @param newSSN
     * @param newWage
     * @param newHours 
     */
    public HourlyEmployee(String newFirstName, String newLastName, 
            String newSSN, double newWage, int newHours){
        
        super( newFirstName,  newLastName, newSSN);
        wage = newWage;
        hours = newHours;
        
    }
    
    // accessor methods
    public double getWage(){
        return wage;
    }
    public int getHours(){
        return hours;
    }
    
    // mutator methods
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
    
    /**
     * getEearning() method that returns the employee's weekly income.
     * @return a double value that represents total earning during the week
     */
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
            
            return super.equals(objH) 
                    && wage == objH.wage 
                    && hours == objH.hours;
        }
    }
}
