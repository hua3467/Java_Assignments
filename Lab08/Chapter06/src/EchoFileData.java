/* Reading a Text File
   Anderson, Franceschi
*/
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class EchoFileData
{
   public static void main( String [] args ) throws IOException
   {
     int number;

     File inputFile = new File( "input.txt" );
     Scanner scan = new Scanner( inputFile );

     while ( scan.hasNext( ) )
     {
        // read next integer
        number = scan.nextInt( );
        // process the value read
        System.out.println( number );
     }

     System.out.println( "End of file detected. Goodbye" );
   }
}
