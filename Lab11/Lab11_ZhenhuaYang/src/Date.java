/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zhenhua.yang.1
 */
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {
    private int day;
    private int month;
    private int year;
    
    public Date( int m, int d, int y ){
        setDay(d);
        setMonth(m);
        setYear(y);
    }
    
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    
    public void setDay( int d ){
        
        GregorianCalendar cal = (GregorianCalendar) Calendar.getInstance();
        
        if( month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ){
            
            if( d >=1  || d <= 31 )
                  System.out.print("T");
               // throw new IllegalArgumentException("in valid day according your month");
            else    
           throw new IllegalArgumentException("in valid day according your month");
        } 
        /*else if( month == 4 || month == 6 || month == 9 || month == 11 ){
            
            if( d <1  || d > 30 )
                throw new IllegalArgumentException("in valid day according your month");
            
        }
        else if( cal.isLeapYear(year) && month == 2 ){
            
            if( d <1  || d > 29 )
                throw new IllegalArgumentException("in valid day according your month");
            
        } 
        else if( cal.isLeapYear(year) && month == 2 ){
            
            if( d <1  || d > 28 )
                throw new IllegalArgumentException("in valid day according your month");
            
        }
        */
        //day = d;
    }
    public void setMonth( int m ){
        
        if( m < 1 || m > 12 )
            throw new IllegalArgumentException("Month must be greater than 0 or smaller than 13" );
        month = m;
    }
    public void setYear( int y ){
        
        if( y < 1582 )
            throw new IllegalArgumentException( "Year must be greater than or equal to 1582");
        year = y;
    }
    
    public String toString(){
        return ( month + "/" + day + "/" + year);
    }
}
