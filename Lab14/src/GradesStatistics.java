/*
The purpose of this code is to read an input file for the grades numbers
and produce varius information from that.
 */

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class GradesStatistics 
{
     public static void main(String[] args)
     {
         //Create object to store File object and use scanner to read
         
	 Scanner scan = new Scanner(System.in);
	 System.out.print("Enter the name of the file to read: ");
         String fileName = scan.next();
         System.out.println();
         
         // Create File object
         File input_File = new File(fileName);
         
         try{
         Scanner file1 = new Scanner(input_File);
         
         int students = 0, sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, next, A = 0, B = 0, C = 0, D = 0, F = 0;
         
         //Take in the sum and number of students, count A, B, C, D, and F students, and compute minimum and maximum
         
         while (file1.hasNext())
         {
             try{
                 
                next = file1.nextInt();
                sum += next;
                students++;

                if (next < min)
                    min = next;
                if (next > max)
                    max = next;

                if (next >= 90)
                    A++;
                else if (next >= 80)
                    B++;
                else if (next >= 70)
                    C++;
                else if (next >= 60)
                    D++;
                else if (next < 60)
                    F++;
                 } catch ( InputMismatchException e ){
                System.out.println( "==============ERROR============="
                                + "\nAll the inputs must be numbers!"
                                + "\n================================");
                file1.next();
             }
         }
         
         
         
         //Compute average and number of people who passed
         
         double average = (double) sum/students;
         int passed = A + B + C + D;
         
         // Create FileOutputStream object.
         FileOutputStream fos = new FileOutputStream("gradeStatisticsOutput.txt", false);
         PrintWriter pw = new PrintWriter(fos);
         
         // Write data to the file
         pw.println( "Number of Students: " + students );
         pw.println( "Average Grades: " + average );
         pw.println( "Highest Grade: " + max );
         pw.println("Lowest Grade: " + min );
         pw.println("The number of students who passed: " + passed);
         pw.println("The number of students who got an A: " + A);
         pw.println("The number of students who got an B: " + B);
         pw.println("The number of students who got an C: " + C);
         pw.println("The number of students who got an D: " + D);
         pw.println("The number of students who got an F: " + F);
         // release the resources associated with gradeStatisticsOutput.txt
         pw.close();
         
         //Output computations
         
         System.out.println("The total amount of students is " + students);
         System.out.println("The average of all the grades is " + average);
         System.out.println("The highest grade is " + max);
         System.out.println("The lowest grade is " + min);
         System.out.println("The number of students who passed is " + passed);
         System.out.println("The number of students who got an A is  " + A);
         System.out.println("The number of students who got an B is " + B);
         System.out.println("The number of students who got an C is " + C);
         System.out.println("The number of students who got an D is " + D);
         System.out.println("The number of students who got an F is " + F);
         
         } catch ( FileNotFoundException fnf ){
             System.out.println("\n==============ERROR============="
                            + "\nCannot find the file you entered!"
                            + "\n================================\n");
         }
     }
}