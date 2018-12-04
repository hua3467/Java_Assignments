/**
 *
 * @author zhenhua.yang.1
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.Random;

public class EmployeeClient {
    
    public static void main( String [] args ){
        
        // create ArrayList object employees and implement generateEmployees() 
        // method to generate ten employees
        ArrayList<Employee> employees = generateEmployees();
        Employee worker = new HourlyEmployee( "Aaron", "Yang", "5079", 60, 40);
        
        // use a for loop to print all the content of the emplyees.
        for ( int i = 0; i < employees.size(); i++ ){
            System.out.println(employees.get(i).toString());
        }
    }
    
    // static method that generates ten employee objects and store in a ArrayList.
    public static ArrayList<Employee> generateEmployees(){
        
        // creare a ArrayList object list
        ArrayList<Employee> list = new ArrayList<>();
        // instantiate a Randome object rand
        Random rand = new Random();
        
        // create String arrays for ten first names, then last names and tem SSNs.
        String[] firstNames = { "Amy", "Aaron", "Jake", "Ming", "Ann", 
            "Mike", "Namcy", "Bryn", "James", "Will" };
        String[] lastNames = { "Lee", "Smith", "Fan", "Yang", "Zhang", 
            "Black", "Vogel", "Megol", "Kong" };
        String[] ssn = { "0987", "2312", "5092", "2309", "0934", 
            "0876", "7823", "9820", "0923", "5667" };
        
        // for loop to create ten Employee objects and add each to list.
        for( int i = 0; i < 10; i++ ){
            // craete a random integer (value) from 0 to 3
            int value = rand.nextInt(3);
            // if value = 0, create HourlyEmployee object hourly
            if( value == 0 ){
                
                int hour = rand.nextInt(40);
                int name = rand.nextInt(9);
                Employee hourly = new HourlyEmployee( firstNames[name], lastNames[name], ssn[name], 
                        (Math.random() + 0.5) * 10, hour);
                list.add(hourly);
                
            } else if( value == 1 ){    // if valur = 1, create a SalariedEmployee object salaried
                
                int name = rand.nextInt(9);
                Employee salaried = new SalariedEmployee( firstNames[name], lastNames[name], ssn[name], 
                        (Math.random() + 5) * 100);
                list.add(salaried);
                
            } else if( value == 2 ){    // if valur = 2, create a CommissionEmployee object commission
                
                int name = rand.nextInt(9);
                Employee commission = new CommissionEmployee( firstNames[name], lastNames[name], ssn[name], 
                        (Math.random() + 0.5) * 10, (Math.random() + 0.5) * 10 );
                list.add(commission);
                
            } else if( value == 3 ){    // if valur = 3, create a BasePlusCommissionEmployee object basePlusComs
                
                int name = rand.nextInt(9);
                Employee basePlusComs = new BasePlusCommissionEmployee( firstNames[name], lastNames[name], ssn[name], 
                        (Math.random() + 0.5) * 10, (Math.random() + 0.5) * 10, 
                        (Math.random() + 0.5) * 10);
                list.add(basePlusComs);
                
            }
            
        }
        return list;
    }
}
