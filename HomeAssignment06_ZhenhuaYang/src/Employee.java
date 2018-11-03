/**
 *
 * @author aaronyang
 */
public class Employee {
    // instance variables
    private int employeeID = nextID;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;
    
    private int count;
    
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
    /**
     * 
     * @return last name
     */
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
    
    @Override
    public String toString(){
        return "Employee Name: " + firstName + " " + lastName 
                + "Employee ID: " + employeeID
                + "Date of Birth: " + birthDate
                + "Date of hiring: " + hireDate;
    }
    
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
