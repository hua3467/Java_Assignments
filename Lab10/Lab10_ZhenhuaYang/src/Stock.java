/**
 *
 * @author zhenhua.yang.1
 */


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
    public double changePercent()
    {
        return ( currentPrice - previousClosingPrice ) / previousClosingPrice;
    }
}
