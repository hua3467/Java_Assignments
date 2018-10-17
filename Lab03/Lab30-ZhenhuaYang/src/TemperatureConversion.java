/**
 *
 * @author zhenhua.yang.1
 */
public class TemperatureConversion {
    public static void main ( String [] args )
    {
        
      // 1. declare any constants here
        final double RATE = (double)5/9;
        final int NUM = 32;
        
      // 2. declare variables to store temp in Fahrenheit 
        int tempF = 90;
        
      // 3. Declare variables to store the results (temp in Celcius)
        int tempC;
        
      // 4. calculate equivalent Celsius temperature and store results in
      //    variables created in step 3.
      tempC =(int)( RATE * ( tempF - NUM ));
      
      // 5. output the temperature in Celsius using verbose English                  
      //    statements using Strings and String concatenation operators
      System.out.println( "The temperature of " + tempF + " Fahrenhrit equals to "
      + tempC + " Celcius");

    }
}
