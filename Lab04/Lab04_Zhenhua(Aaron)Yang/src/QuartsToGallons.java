/**
 *
 * @author Zhenhua Yang
 * @date 09/13/2018
 */
public class QuartsToGallons {
    public static void main( String [] args )
    {
        // the number of quarts in a gallon
        final int QUARTS_PER_GALLON = 4;
        
        // total number of quarts needed for a paint job
        int quartsTotal = 63;
        // total gallons included in quartsTotal
        int gallon = quartsTotal / QUARTS_PER_GALLON;
        // the quarts left in quartsTotal
        int quart = quartsTotal - gallon * 4;
        
        // output the result
        System.out.println( " A job that needs " + quartsTotal 
                + " quarts requires " + gallon + " gallons plus "
                + quart + " quarts.");
        
    }
}
