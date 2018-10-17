/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zhenhua.yang.1
 */
import java.util.Scanner;

public class Tempreture 
{
    public static void main( String[] args )
    {
        // create a variable t
        int t;

        // create a Scanner object
        Scanner input = new Scanner( System.in );

        // read a data from keyboard and assign it to the variable t.
        System.out.print("Please enter a tempreture> ");
        t = input.nextInt();
        
        // check the statements:
        if( t >= 90 && t <= 110 )
            System.out.println( "It is probably summer." );
        else if( t >= 70 && t < 90 )
                System.out.println( "It is probably spring." );
        else if( t >= 50 && t < 70 )
                System.out.println( "it is probably fall." );
        else if( t < 50 )
                System.out.println( "It is probably winter." );
        else if( t > 110 || t < -5 )
                System.out.println( "Outside the valid range.." );
        
    }
    
    
}
