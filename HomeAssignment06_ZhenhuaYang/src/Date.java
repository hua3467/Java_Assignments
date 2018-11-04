/**
 *
 * @author zhenhua.yang.1
 */
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {
    
    // Create instant variables
    private int day;
    private int month;
    private int year;
    
    // Date constructor
    public Date( int m, int d, int y ){

        setYear(y);
        setMonth(m);
        setDay(d);
    }
    
    // Access methods
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    
    /**
     * mutator methods
     * @param d 
     */ 
    // set the day
    private void setDay( int d ){
        
        // create GregorianCalendar object
        GregorianCalendar cal = (GregorianCalendar) Calendar.getInstance();
        
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                if( d <=1  || d >= 31 )     // if d<1 or d>31, throw error message.
                throw new IllegalArgumentException("Day value must be from 1 to 31 for month " + month);
                break;
            }
            
            case 4:
            case 6:
            case 9:
            case 11:{
                if( d <1  || d > 30 )      // if d<1 or d>30, throw error message.
                throw new IllegalArgumentException("Day value must be from 1 to 30 for month " + month);
                break;
            }
            
            case 2:{
                if (cal.isLeapYear(year)){
                    if( d <1  || d > 29 )   // if d<1 or d>29, throw error message. 
                        throw new IllegalArgumentException("At" + year + ", the day in February must be from 1 to 29");
                } else if ( ! ( cal.isLeapYear(year) ) ){
                    if( d < 1 || d > 28 )
                        throw new IllegalArgumentException("At" + year + ", the day in February must be from 1 to 28");
                }
                break;
            }     
        }

        day = d;    // assign d to day.

    }
    // set month
    private void setMonth( int m ){
        
        if( m < 1 || m > 12 )   // if m<1 or m>12, throw error message.
            throw new IllegalArgumentException("Month must be greater than 0 or smaller than 13" );
        month = m;
    }
    // set month
    private void setYear( int y ){
        
        if( y < 1582 )  // if y<1582, throw error message.
            throw new IllegalArgumentException( "Year must be greater than or equal to 1582");
        year = y;
    }
    
    // toString method
    @Override
    public String toString(){
        return ( month + "/" + day + "/" + year);
    }

    // equals method
    @Override
     public boolean equals( Object o ){
         
        if( ! ( o instanceof Date ))
            return false;
        else{
            Date objDate = ( Date ) o;
            return day == objDate.day && month == objDate.month && year == objDate.year;
        }
    }
}