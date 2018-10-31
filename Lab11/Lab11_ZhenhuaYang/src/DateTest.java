/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zhenhua.yang.1
 */
public class DateTest {
    public static void main( String [] args ){
        
        // create two Date objects
        Date myDate = new Date( 2, 29, 2016 );
        Date newDate = new Date( 1, 28, 2016);
        
        // apply toString method
        System.out.println( "The first date is " + myDate.toString() );
        System.out.println( "The second date is " + newDate.toString() );
        
        // apply equals method
        if ( myDate.equals(newDate))
            System.out.println( "Two dates are equal.");
        else
            System.out.println( "Two dates are not equal.");
    }
}
