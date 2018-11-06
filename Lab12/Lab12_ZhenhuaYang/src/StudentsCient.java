/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaronyang
 */
public class StudentsCient {
    
    public static void main( String [] args ){
    
    Course [] courses ={ new Course( 713, "Software Development", 3, "Magel"),
                        new Course( 715, "Requirement Engineering", 3, "Walia"),
                        new Course( 887, "Research", 3, "Jun" ),
                        new Course( 160, "Computer Science 1", 0, "Kotala"),
                        new Course( 161, "Computer Science 2", 0, "Joe") };
    
    Student aaronYang = new Student( "Aaron Yang", 3.86, 'M', courses);
    Student zhenhuaYang = new Student( "Aaron Yang", 3.86, 'M', courses);
    
    System.out.println( aaronYang.toString() );
    System.out.println( zhenhuaYang.toString() );
    
    System.out.println( "Are Aaron and Zhenhua the same person (ignore ID)? " + aaronYang.equals(zhenhuaYang));
    
    }
    
}
