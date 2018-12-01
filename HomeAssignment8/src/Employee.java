/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zhenhua.yang.1
 */


public abstract class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    
    public Employee(){
        firstName = null;
        lastName = null;
        ssn = null;
    }
    
    public Employee( String fn, String ln, String s ){
        firstName = fn;
        lastName = ln;
        ssn = s;
    }
    
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    
    public void setFirstName( String newFirstName ){
        firstName = newFirstName;
    }
    
    public void setLastName( String newLastName ){
        firstName = newLastName;
    }
    
    public String toString(){
        return "First Name: " + firstName + 
                "\nLast Name: " + lastName +
                "\nSSN: " + ssn;
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
    
    public abstract double getEarnings();
    
}
