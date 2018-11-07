/**
 *
 * @author ZhenhuaYang
 */
public class Employee {
    // instance variables
    private int employeeID = nextID;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;
    
    static int count;
    static int nextID = 1000;
    
    /**
     * constructor
     * @param fn    the first name
     * @param ln    the last name
     * @param bd    the birth date of the employee
     * @param hd    the hire date of the employee
     */
    public Employee( String fn, String ln, Date bd, Date hd ){
        
        firstName = fn;
        lastName = ln;
        birthDate = bd;
        hireDate = hd;
        count++;
        nextID++;
        
    }
    /**
     * 
     * @return first name;
     */
    public String getFirstName(){
        return firstName;
    }
    
    
    // Accessor methods
    public String getLastName(){
        return lastName;
    }
    
    public Date getBirthDate(){
        return birthDate;
    }
    public Date getHireDate(){
        return hireDate;
    }
    public int getEmployeeCount(){
        return count;
    }
    
    // Mutator methods
    public void setFirstName( String fn ){
        firstName = fn;
    }
    public void setLastName( String ln ){
        lastName = ln;
    }
    public void setBirthDate( Date bd ){
        birthDate = bd;
    }
    public void setHireDate( Date hd ){
        hireDate = hd;
    }
    /**
     * 
     * @return the data of an Employee object as string
     */
    @Override
    public String toString(){
        return "\nEmployee Name: " + firstName + " " + lastName 
                + "\nEmployee ID: " + employeeID
                + "\nDate of Birth: " + birthDate
                + "\nDate of hiring: " + hireDate;
    }
    
    /**
     * compare two Employee objects to see if they are equal to each other. 
     * @param o
     * @return 
     */
    @Override
    public boolean equals( Object o ){
        
        if( !( o instanceof Employee ))
            return false;
        else{
            Employee objEmployee = (Employee) o;
            return employeeID == objEmployee.employeeID && firstName == objEmployee.firstName 
                    && lastName == objEmployee.lastName && birthDate == objEmployee.birthDate
                    && hireDate == objEmployee.hireDate;
        }
    }
    
}
