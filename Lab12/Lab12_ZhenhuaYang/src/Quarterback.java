/**
 *
 * @author aaronyang
 */
import java.text.DecimalFormat;
public class Quarterback {
    public static void main( String [] args ){

        // create int arrays to save the statistics of the player
        int [] yards = { 298, 363, 285, 256, 254, 295, 251, 397, 303, 280, 230, 269, 224, 246, 206, 334 };
        int [] attempts = { 34, 46, 36, 27, 42, 44, 38, 45, 45, 46, 31, 45, 34, 35, 30, 36 };
        int [] completions = { 23, 30, 24, 19, 24, 30, 22, 37, 30, 25, 22, 30, 22, 22, 23, 24 };
        int [] yardsPerAttempt = new int[yards.length];
        
        // define variables
        final int HIGHER_YARDS = 275;

        int totalYards = 0;
        int totalHigherYards = 0;
        int maxYards = 0;

        // create DecimalFormat object
        DecimalFormat percent = new DecimalFormat( "0.0%");

        // create for loop
        for ( int i = 0; i < yards.length; i++ ){

            totalYards += yards[i];         // calculate the total yards

            if( yards[i] > HIGHER_YARDS )   
                totalHigherYards ++;        // calculate the total number of yards that is larger than 275

            yardsPerAttempt[i] = yards[i] / attempts[i];    // calculate yards per attempt

            if( maxYards < yards[i] )
                maxYards = yards[i];        // find the largest yard
        }

        // print the results:
        System.out.println( "\nAverage number of yards per attempt: ");
        for ( int i = 0; i < yards.length; i++ ){
            System.out.print(  yardsPerAttempt[i] + "\t");
        }

        System.out.println( "\n\nAverage completion percentage for each of the games: ");
        for ( int i = 0; i < yards.length; i++ ){
            System.out.print( percent.format((double) completions[i] / (double)attempts[i] ) + "\t");
        }
        System.out.println( "\n\nTotal yards throws in the entire season: " + totalYards
                + "\nNumber of games where the number of yards was over 275: " + totalHigherYards
                + "\nHighest yards thrown in a game: " + maxYards );


    }
}
