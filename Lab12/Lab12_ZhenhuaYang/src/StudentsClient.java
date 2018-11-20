/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaronyang
 */
public class StudentsClient {
    
    public static void main( String [] args ){

            // create a Course array and define five Course objects inside it. 
        Course [] courses ={ new Course( 713, "Software Development", 3, "Magel"),
                            new Course( 715, "Requirement Engineering", 3, "Walia"),
                            new Course( 887, "Research", 3, "Jun" ),
                            new Course( 160, "Computer Science 1", 0, "Kotala"),
                            new Course( 161, "Computer Science 2", 0, "Joe") };
        // create two student objects
        Student aaronYang = new Student( "Aaron Yang", 3.86, 'M', courses);
        Student zhenhuaYang = new Student( "Aaron Yang", 3.86, 'M', courses);
        // print the information of two Student objects
        System.out.println( aaronYang.toString() );
        System.out.println( zhenhuaYang.toString() );

        System.out.println( "Are Aaron and Zhenhua the same person (ignore ID)? " + aaronYang.equals(zhenhuaYang));
        // print the information of each course
        System.out.println( "\n=======Course Information======" );
        for( int i = 0; i < courses.length; i++ ){
            System.out.println( courses[i].toString() );
        }
    
    }
    
}
