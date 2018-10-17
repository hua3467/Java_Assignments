/**
 *
 * @author zhenhua.yang.1
 */
public class ElapsedTime 
{
    public static void main( String [] args)
    {
        int totalSeconds = 8732;
        int hours;
        int minutes;
        int seconds;
        
        // total hours included in 8732 seconds
        hours = totalSeconds / (60*60);
        
        // total minutes in the rest of the seconds
        minutes = (totalSeconds - ( hours * 3600 )) / 60;
        
        // the seconds left
        seconds = totalSeconds % 60;
        
        System.out.println( "8732 seconds = " + hours + ":" + minutes + ":" + seconds ); 
    }
}
