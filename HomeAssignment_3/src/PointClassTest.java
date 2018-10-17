/**
 *
 * @author zhenhua.yang.1
 */
import java.awt.Point;
import java.util.Scanner;

public class PointClassTest
{
    public static void main( String [] args )
    {
        int x1;
        int y1;
        int x2;
        int y2;
        
        Scanner input = new Scanner( System.in );
        System.out.print( "x1: ");
        x1 = input.nextInt();
        
        System.out.print( "y1: ");
        y1 = input.nextInt();
        
        System.out.print( "x2: ");
        x2 = input.nextInt();
        
        System.out.print( "y2: ");
        y2 = input.nextInt();
        
        Point point1 = new Point( x1, y1 );
        Point point2 = new Point( x2, y2 );
        
        System.out.println( "\n1. Before the operation: \n\tpoint1 is " + point1.toString() + 
                "\n\tpoint2 is " + point2.toString() );
        
        point1.translate(5, 10);
        point2.translate(5, 10);
        
        point1.move( 15, 20 );
        point2.move( 15, 20 );
        
        System.out.println( "4. After the operation: \n\tpoint1 is " + point1.toString() + 
                "\n\tpoint2 is " + point2.toString());
        
    }
    
    
}
