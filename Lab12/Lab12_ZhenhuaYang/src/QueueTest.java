/**
 *
 * @author zhenhua.yang.1
 */
import java.util.Random;

public class QueueTest {
    public static void main( String[] args ){
        
        int [] array1 = new int[10];    // create an array variable with the size of 10.
        
        Random ran = new Random();      // create the Random object
        
        // add random numbers into arrqy1
        for( int i = 0; i < array1.length; i++ ){
            array1[i] = ran.nextInt(100);
        }
        // create Queue object and assign array1 to it. 
        Queue queue1 = new Queue(array1);
        
        // print the all the element of queue1.
        System.out.println( "Queue1 is: \n" + queue1.toString());
        
        // add five values to queue1 using enqueue method
        queue1.enqueue(32);
        queue1.enqueue(5);
        queue1.enqueue(73);
        queue1.enqueue(82);
        queue1.enqueue(19);
        
        //print the current queue1.
        System.out.println( "\nAfter enqueue five values, Queue1 is: \n" + queue1.toString());
        //print the largest value of queue.
        System.out.println( "the maximum value of the queue is: " + queue1.maxValue() );
        
        // perform dequeue() method and print the queue1
        System.out.println( "\nRemove the first value of Queue1: " + queue1.dequeue());
        System.out.println( "After the dequeue operation, Queue1 becomes: \n" + queue1.toString());
        // perform dequeue() method again and print the queue1
        System.out.println( "\nRemove the first value of Queue1: " + queue1.dequeue());
        System.out.println( "After another dequeue operation, Queue1 becomes: \n" + queue1.toString());
        // perform dequeue() method again and print the queue1
        System.out.println( "\nRemove the first value of Queue1: " + queue1.dequeue());
        System.out.println( "After another dequeue operation, Queue1 becomes: \n" + queue1.toString());

    }
}
