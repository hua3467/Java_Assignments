/**
 *
 * @author zhenhua.yang.1
 */
import java.util.ArrayList;
import java.util.Random;

public class EmployeeClient {
    
    static ArrayList<Employee> generateEmployees(){
        
        ArrayList<Employee> list = new ArrayList<Employee>();
        Random rand = new Random();
        
        for( int i = 0; i < 10; i++ ){
            
            int value = rand.nextInt(4);
            double pay = rand.nextDouble();
            
            if( value == 1 ){
                Employee hourly = new HourlyEmployee( "Aaron", "Yang", "4025", 45.0, 40);
            } else if( value == 2 ){
                Employee salaried = new SalariedEmployee();
            }
            
        }
        
        return list;
    }
}
