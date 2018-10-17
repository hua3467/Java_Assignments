/**
 *
 * @author aaronyang
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Grades 
{
    public static void main( String[] args ) throws FileNotFoundException
    {
        // create variables 
        int count = 0;
        int grade;
        int total = 0;
        int average;
        int max = 0;
        int min = 100;
        
        // create and initiate variables for each grade scale
        int countP = 0, countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;
        
        
        File inputFile = new File("grades.txt");        // Initiate File object and link to grades.txt file
        Scanner file = new Scanner( inputFile );        // Initiate Scanner object and read inputFile
        
        // start while loop
        while ( file.hasNext() ) 
        {
            grade = file.nextInt();             // read a data from the file and assign it to grade
            total += grade;                     // calculate the sum of all grades
            count ++;                           // increment count
            
            if( max < grade )       // find the highest grade
                max = grade;
            
            if( min > grade )       // find the lowest grade
                min = grade;
            
            if( grade >= 60 )       // find the number of students who passed( grade >=60 )
                countP ++;
            
            if( grade >= 90 )       // find the number of students who got "A" ( grade >=90 )
                countA ++;
            
            if( grade >= 80 && grade <= 90 )    // find the number of students who got "B" ( 80 - 90)
                countB ++;
            
            if( grade >= 70 && grade <= 80 )    // find the number of students who got "C" ( 70 - 80 )
                countC ++;
            
            if( grade >= 60 && grade <= 70 )    // find the number of students who got "D" ( 60 - 70)
                countD++;
            
            if( grade < 60 )                    // find the number of students who got "F" ( < 60 )
                countF++;
               
        }   // end while statement
        
        
        average = total / count;                // calculate the average of all grades
        
        // print the result
        System.out.println( "\nCount of Students: " + count + 
                "\nAverage grade: " + average +
                "\nHighest Grade: " + max + 
                "\nLowest Grade: " + min + 
                "\n\nNumber of students who passed (grade >=60): " + countP +
                "\nNumber of students who got “A” grade ( >= 90): " + countA + 
                "\nNumber of students who got “B” grade (>=80 - <90): " + countB + 
                "\nNumber of students who got “C” grade ((>=70 - <80): " + countC + 
                "\nNumber of students who got “D” grade (>= 60 - <70): " + countD + 
                "\nNumber of students who got “F” grade (<60): " + countF );
    }
    
}
