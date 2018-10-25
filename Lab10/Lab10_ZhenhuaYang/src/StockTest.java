/**
 *
 * @author zhenhua.yang.1
 */
import java.text.DecimalFormat;

public class StockTest {
    public static void main( String [] args )
    {
        // instantiate the Stock object
        Stock appleStock = new Stock( "AAPL", "Apple" );
        
        // set the previous closing price and current price of the appleStock object
        appleStock.setPrevClosingPrice( 220.6 );
        appleStock.setCurrentPrice( 150 );
        
        // instantiate the DecimalFormat object. 
        DecimalFormat percentFormat = new DecimalFormat( "0.00%" );
        
        // print the information of the stock
        System.out.println( "Stock name: " + appleStock.getName() 
                + "\nStock symbol: " + appleStock.getSymbol() 
                + "\nPrevious closing price: " + appleStock.getPrevClosingPrice() + " USD"
                + "\nCurrent price: " + appleStock.getCurrentPrice() + " USD");
        
        // conver the change to percentate format and print out. 
        System.out.println( "Change percentage: " + percentFormat.format( appleStock.changePercent() ) ); 
                        
    }
}
