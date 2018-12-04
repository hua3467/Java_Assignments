/**
 * Employee is an abstract class for all type of employee classes. 
 * By implementing this class, an application can create following data:
 * <ul>
 * <li>First Name of the employee</li>
 * <li>Last Name of the employee</li>
 * <li>SSN of the employee</li>
 * </ul>
 * @author zhenhua.yang.1
 * @version 1.0
 */

public abstract class Employee {
    
    // instance variables
    private String firstName;
    private String lastName;
    private String ssn;
    
    //constructor
    public Employee( String fn, String ln, String s ){
        firstName = fn;
        lastName = ln;
        ssn = s;
    }
    
    //Accesser methods:
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getSSN(){
        return ssn;
    }
    
    // mutator methods
    public void setFirstName( String newFirstName ){
        firstName = newFirstName;
    }
    public void setLastName( String newLastName ){
        firstName = newLastName;
    }
    
    // abstract gerEarnings() method
    public abstract double getEarnings();
    
    public String toString(){
        return "Full Name: " + firstName +" " + lastName + "\tSSN: " + ssn;
    }
    
    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals( Object o ){
        if( ! (o instanceof Employee) )
            return false;
        else{
            
            Employee objE = (Employee)o;
            
            return objE.firstName.equals(firstName) 
                    && objE.lastName.equals(lastName) 
                    && objE.ssn.equals(ssn);
        }
    }
    
    
    
}
