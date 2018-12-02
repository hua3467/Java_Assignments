/**
 *
 * @author zhenhua.yang.1
 */
import java.util.ArrayList;
import java.util.Random;

public class EmployeeClient {
    
    public static void main( String [] args ){
        ArrayList<Employee> employees = generateEmployees();
        
        for ( int i = 0; i < employees.size(); i++ ){
            System.out.println(employees.get(i).toString());
        }
    }
    
    public static ArrayList<Employee> generateEmployees(){
        
        ArrayList<Employee> list = new ArrayList<>();
        Random rand = new Random();
        
        String[] firstNames = { "Amy", "Aaron", "Jake", "Ming", "Ann", 
            "Mike", "Namcy", "Bryn", "James", "Will" };
        String[] lastNames = { "Lee", "Smith", "Fan", "Yang", "Zhang", 
            "Black", "Vogel", "Megol", "Kong" };
        String[] ssn = { "0987", "2312", "5092", "2309", "0934", 
            "0876", "7823", "9820", "0923", "5667" };
        
        for( int i = 0; i < 10; i++ ){
            
            int value = rand.nextInt(3);
            
            if( value == 0 ){
                
                int hour = rand.nextInt(40);
                int name = rand.nextInt(9);
                Employee hourly = new HourlyEmployee( firstNames[name], lastNames[name], ssn[name], 
                        (Math.random() + 0.5) * 10, hour);
                list.add(hourly);
                
            } else if( value == 1 ){
                
                int name = rand.nextInt(9);
                Employee salaried = new SalariedEmployee( firstNames[name], lastNames[name], ssn[name], 
                        (Math.random() + 5) * 100);
                list.add(salaried);
                
            } else if( value == 2 ){
                
                int name = rand.nextInt(9);
                Employee commission = new CommissionEmployee( firstNames[name], lastNames[name], ssn[name], 
                        (Math.random() + 0.5) * 10, (Math.random() + 0.5) * 10 );
                list.add(commission);
                
            } else if( value == 3 ){
                
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
