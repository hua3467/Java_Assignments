/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zhenhua.yang.1
 */
public class StockTest {
    public static void main( String [] args )
    {
        // instantiate the Stock object
        Stock appleStock = new Stock( "AAPL", "Apple" );
        
        // set the previous closing price and current price of the appleStock object
        appleStock.setPrevClosingPrice( 220.6 );
        appleStock.setCurrentPrice( 150 );
        
        // print the information of the stock
        System.out.println( "Stock name: " + appleStock.getName() 
                + "\nStock symbol: " + appleStock.getSymbol() 
                + "\nPrevious closing price: " + appleStock.getPrevClosingPrice() + " USD"
                + "\nCurrent price: " + appleStock.getCurrentPrice() + " USD"
                + "\nChange percentage: " + appleStock.changePercent() );
    }
}
