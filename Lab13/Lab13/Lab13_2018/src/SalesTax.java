/**
 *
 * @author ZhenhuaYang
 */
import java.text.DecimalFormat;

public class SalesTax {
    
    public static void main( String [] args ){

        double [][] usStates = create2DArray();
        
        System.out.println( getString(usStates));
        System.out.println( "\ntaxRatesForSpecificState: " + taxRatesForSpecificState( usStates, 6));
        System.out.println( "\ntaxRatesForSpecificYear: \n" + taxRatesForSpecificYear( usStates, 7));
    }



    public static double[][] create2DArray(){
        double [][] taxRates = new double[50][10];
       
        for( int i = 0; i < taxRates.length; i++){
            for( int j = 0; j < taxRates[i].length; j++ ){
                taxRates[i][j] = Math.random()*0.06 ;
            }
        }
        return taxRates;
    }
    /**
     * 
     * @param array
     * @return 
     */
    public static String getString( double [][] array){
        // create a DecimalFormat object
        DecimalFormat twoDecimal = new DecimalFormat("0.00");
         
        String str = "";
        for( int i = 0; i < array.length; i++){
            for( int j = 0; j < array[i].length; j++ ){
                if( j % 10 == 0 )
                    str += "\n";
                str += twoDecimal.format(array[i][j]) + "\t" ;  // format the elements in the 2D-array
            }
        }
        
        return str;
    }
    
    public static String taxRatesForSpecificState( double [][] array, int stateIndex ){
        String  str = "";

        // create a DecimalFormat object
        DecimalFormat twoDecimal = new DecimalFormat("0.00");

        for( int i = 0; i < array[stateIndex].length; i++ ){
            str += twoDecimal.format(array[stateIndex][i] )+ "\t";
        }

        return str;
    }
    
    public static String taxRatesForSpecificYear( double [][] array, int yearIndex ){
        String  str = "";

        // create a DecimalFormat object
        DecimalFormat twoDecimal = new DecimalFormat("0.00");

        for( int i = 0; i < array.length; i++ ){
            if( i % 10 == 0 )
                str += "\n";
            else
                str += twoDecimal.format(array[i][yearIndex]) + "\t";
        }
        return str;
    }
    
    public static int stateWithHighestTaxRate( double [][] array ) {
        
        double maxAvg = 0;
        double sumYear = 0;
        double avgRate = 0;
        int maxIndex = 0;
        
        for( int i = 0; i < array.length; i++ ){
            for( int j = 0; j < array[i].length; j++ ){
                sumYear += array[i][j];   
            }
            avgRate = sumYear / array[i].length;
                if( maxAvg < avgRate )
                    maxIndex = i;
        }
        return maxIndex;
    }
    
    public static int[] statesWithLowSalexTaxRate( double [][] array ){
        int[] arr = new int [10];
        return arr;
    }
    
    public static double[] statesHighestSalesTaxRate(){
        double[] arr = new double[10];
        return arr;
    }
}
