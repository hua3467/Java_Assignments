/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zhenhua.yang.1
 */
import java.text.DecimalFormat;

public class Stock {
    
    // create private viriables
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    
    // constructor that creates a stock with a specified symbol and name
    public Stock( String newSymbol, String newName )
    {
        symbol = newSymbol;
        name = newName;
    }
    
    // accessor methods
    public String getSymbol()
    {
        return symbol;
    }
    public String getName()
    {
        return name;
    }
    public double getPrevClosingPrice()
    {
        return previousClosingPrice;
    }
    public double getCurrentPrice()
    {
        return currentPrice;
    }
    
    // mutator methods
    public void setPrevClosingPrice( double pcp)
    {
        previousClosingPrice = pcp;
    }
    public void setCurrentPrice( double cp )
    {
        currentPrice = cp;
    }
    
    // percentage changed from previousClosingPrice to currentPrice
    public String changePercent()
    {
        DecimalFormat percentFormat = new DecimalFormat( "0.00%" );
        String percent = percentFormat.format(( currentPrice - previousClosingPrice ) / previousClosingPrice);
        return percent;
    }
}
