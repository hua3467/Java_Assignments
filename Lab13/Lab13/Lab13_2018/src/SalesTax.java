/**
 *
 * @group of ZhenhuaYang, YingyaLi, AmrithaRaveendran
 */
import java.text.DecimalFormat;

public class SalesTax {

    public static void main( String [] args ){

        DecimalFormat twoDecimals = new DecimalFormat("0.00");
        
        // i. Create a 2D double array variable named US-States 
        // and assign it the value returned by create2DArray() static method.
        double [][] usStates = create2DArray();
        
        // ii. Print the string returned by getString() static method 
        System.out.println( "\nii.Print the string: \n" + getString(usStates));
        
        // iii. Print the string returned by taxRatesForSpecificState() 
        System.out.println( "\niii.taxRatesForSpecificState: " + taxRatesForSpecificState( usStates, 6));
        
        // iv. Print the string returned by taxRatesForSpecificYear() 
        System.out.println( "\niv.taxRatesForSpecificYear: \n" + taxRatesForSpecificYear( usStates, 7));
        System.out.println();
        
        // v.Print the value returned by stateWithHighestTaxRate() 
        System.out.println( "\nv.State with Highest Tax Rate: \n" + stateWithHighestTaxRate(usStates));
        System.out.println();
        
        // vi.	Create an int array variable statesWithLowSalesTaxRate 
        // and assign it the value returned by statesWithLowSalexTaxRate()
        int [] statesWithLowSalesTaxRate = statesWithLowSalexTaxRate(usStates);
        // Print the array
        System.out.println("\nvi.States with Low Sales Tax Rate: ");
        for( int i = 0; i < statesWithLowSalesTaxRate.length; i++ ){
            System.out.println(statesWithLowSalesTaxRate[i]);
        }
        
        // vii.	Create a double array variable statesHighestSalesTaxRate 
        // and assign it the value returned by statesHighestSalesTaxRate ().
        double [] statesHighestSalesTaxRate  = statesHighestSalesTaxRate(usStates);
        // Print the array
        System.out.println("\nvii.Highest Sales Tax Rate of each state over the 10 years: ");
        for( int i = 0; i < statesHighestSalesTaxRate .length; i++ ){
            System.out.println(twoDecimals.format(statesHighestSalesTaxRate [i]));
        }
  
    }

    /**
     * the static method that create a 2D Array.
     * @return a 2D Array with double elements.
     */
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
     * the method that return all the elements in the 2D array in a String.
     * @param array the array that is going to be returned as a String.
     * @return all the elements of the array in a string. 
     */
    public static String getString( double [][] array){
        // create a DecimalFormat object
        DecimalFormat twoDecimal = new DecimalFormat("0.00");
         
        String str = "";
        for( int i = 0; i < array.length; i++){
            for( int j = 0; j < array[i].length; j++ ){
                str += twoDecimal.format(array[i][j]) + "\t" ;  // format the elements in the 2D-array
            }
            str += "\n";
        }
        
        return str;
    }
    
    /**
     * The method that return the tax rates in each year of selected state.
     * @param array the 2-d array that will passed into the method
     * @param stateIndex the index of the selected state.
     * @return a string of the tax rates in each year.
     */
    public static String taxRatesForSpecificState( double [][] array, int stateIndex ){
        String  str = "";

        // create a DecimalFormat object
        DecimalFormat twoDecimal = new DecimalFormat("0.00");

        for( int i = 0; i < array[stateIndex].length; i++ ){
            str += twoDecimal.format( array[stateIndex][i] )+ "\t";
        }

        return str;
    }
    
    /**
     * The method that returns a string of tax rate of each state in a certain year
     * @param array the 2-d array that will passed into the method
     * @param yearIndex the index of the selected year.
     * @return string of tax rate of each state in a certain year
     */
    public static String taxRatesForSpecificYear( double [][] array, int yearIndex ){
        String  str = "";

        // create a DecimalFormat object
        DecimalFormat twoDecimal = new DecimalFormat("0.00");

        for( int i = 0; i < array.length; i++ ){
            if( i % 10 == 0 && i !=0 )
                str += twoDecimal.format(array[i][yearIndex]) + "\n";
            else
                str += twoDecimal.format(array[i][yearIndex]) + "\t";
        }
        
        return str;
    }
    
    /**
     * The method that return the index of the state that has the highest tax rate in the array. 
     * @param array the 2-d array that includes the tax rates of states over 10 years. 
     * @return the index of the state that has the highest tax rate.
     */
    public static int stateWithHighestTaxRate( double [][] array ) {
        
        double maxAvg = 0;
        double sumYear = 0;
        int maxIndex = 0;
        
        for( int i = 0; i < array.length; i++ ){
            
            for( int j = 0; j < array[i].length; j++ ){
                sumYear += array[i][j];   
            }
            
                if( maxAvg < sumYear / array[i].length ){
                    maxIndex = i;
                    maxAvg = sumYear / array[i].length;
                }
        }
        return maxIndex;
    }
    
    /**
     * method that find the states with Low Sales Tax Rate
     * @param array the 2-d array that includes the tax rates of states over 10 years.
     * @return the array of index of states with Low Sales Tax Rate
     */
    public static int[] statesWithLowSalexTaxRate( double [][] array ){
        int[] arr = new int [array.length];
        int count = 0;
        
        for( int i = 0; i < array.length; i++ ){
            for( int j = 0; j < array[i].length; j++ ){
                if( array[i][j] < 0.001 ){
                    arr[count] = i;
                    count++;
                    break;
                }
            }
        }
        
        int [] temp = new int[count];
        for( int i = 0; i < count; i++ ){
            temp[i] = arr[i];
        }
        
        return temp;
    }
    
    /**
     * the method that finds the highest Sales Tax Rate of each state over the 10 years
     * @param array the 2-d array that includes the tax rates of states over 10 years.
     * @return the array of tax rate of each state over the 10 years.
     */
    public static double[] statesHighestSalesTaxRate( double [][] array ){
        double[] arr = new double[array.length];
        double max = 0;
        
        for(int i = 0; i < array.length; i++){
            for( int j = 0; j < array[i].length; j++ ){
                if( max < array[i][j]){
                    max = array[i][j];
                }
                arr[i]= max;
                max = 0;
            }
        }
        return arr;
    }
}