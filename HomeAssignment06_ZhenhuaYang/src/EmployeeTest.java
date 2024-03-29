/**
 *
 * @author ZhenhuaYang
 */
public class EmployeeTest {
    public static void main( String [] args ){
        
        // Create three Employee objects
        Employee jake = new Employee( "Jake", "Qi", new Date(2, 23, 1988), new Date(2, 23, 2018));
        Employee aaron = new Employee( "Aaron", "Yang", new Date(2, 23, 1986), new Date(1, 23, 2018));
        Employee mark = new Employee( "Mark", "Lee", new Date(2, 23, 1988), new Date(4, 12, 2019));
        
        System.out.println( jake.getEmployeeCount()); // test static variable count
        // print data of three objects
        System.out.println( jake.toString() );        
        System.out.println( aaron.toString() );
        System.out.println( mark.toString() );
        // test equals() method
        System.out.println( "\nAre Aaron and Mark the same person? " + aaron.equals(mark) );
    }
}
