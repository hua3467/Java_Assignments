/**
 *
 * @author zhenhua.yang.1
 */
public class Circle {
    public static void main ( String [] args )
    {
        //1. Declare any constants you would need
        final double PI = 3.14159;

	/*2. Declare variables you would need to store the radius,   
             area and perimeter
        */
        double radius = 3.2;
        double area;
        double perimeter;

	/*3. Perform appropriate calculations to 
             calculate area and perimeter and assign it 
             to the variables area and perimeter created in step 2.*/
        area = PI * radius * radius;
        perimeter = 2 * radius * PI;


	/*4. Output the area and perimeter. Ensure the 
             output is verbose using Strings and String 
             concatenation operator.*/
        
        // The result is too long, so I casted them to int. 
        System.out.println( "The area of this circle is " + (int)area 
                + " square inches, and the perimeter of it is " + (int)perimeter + " inches" );

    }
}
