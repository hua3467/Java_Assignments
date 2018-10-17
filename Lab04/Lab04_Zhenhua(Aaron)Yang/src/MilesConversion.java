/**
 *
 * @author Zhenhua Yang
 * @date 09/13/2018
 */
public class MilesConversion {
    
    public static void main( String [] args )
    {
        // define the number of inches, feet, and years included in a mile
        final int INCH_PER_MILE = 63360;
        final int FEET_PER_MILE = 5280;
        final int YARDS_PER_MILE = 1760;
    
        // the total miles waiting to convert
        int miles = 12;
    
        // output the result
        System.out.println( miles + " miles equal to " 
                + miles * INCH_PER_MILE + " inches, or " 
                + miles * FEET_PER_MILE + " feets, or " 
                + miles * YARDS_PER_MILE );
            
    }
    
}
