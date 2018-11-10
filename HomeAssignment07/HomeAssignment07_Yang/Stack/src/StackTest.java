/**
 *
 * @author aaronyang
 */
import java.util.Random;

public class StackTest {
    public static void main( String [] args ){
        
        //1. Create an int array with length 10 and store 10 random int values in the array between 1 and 100. 
        //Make use of the Random class to generate these random values.
        int [] newList = new int [10];
        Random rand = new Random();
        for( int i = 0; i < newList.length; i++ ){
            newList[i] = rand.nextInt(100);
        }
        
        //2. Create a Stack object using the overloaded constructor and pass the array you created in the first step.
        Stack myStack = new Stack(newList);
        
        //3. Print the contents of the stack.
        System.out.println( "\n- Print the contents of the stack: \n  " + myStack.toString());
        
        //4. Add the following values to the stack by calling the push method: 32, 5, 73, 82, 19
        myStack.push(32);
        myStack.push(5);
        myStack.push(73);
        myStack.push(82);
        myStack.push(19);
        //5. Print the contents of the stack.
        System.out.println( "\n- Add five values: " + myStack.toString());
        
        //6. Print the maximum value in the stack
        System.out.println( "\n- The maximum value: " + myStack.maxValue());

        //7. Perform a pop operation on the stack and print the value the pop method returns
        System.out.println( "\n- Delete this value using pop() method: " + myStack.pop());
        //8. Print the contents of the stack.
        System.out.println( "- After pop: " + myStack.toString());
        //9. Call the top( ) method to print the element at the top of the stack
        System.out.println( "- The element at the top is: " + myStack.top());

        //10. Perform another pop operation on the stack and print the value the pop method returns
        System.out.println( "\n- Delete this value using pop() method: " + myStack.pop());
        //11. Call the top( ) method to print the element at the top of the stack
        System.out.println( "- Now the element at the top is: " + myStack.top());
        //12. Print the contents of the stack.
        System.out.println( "- Now the stack is: " + myStack.toString());
        
        //13. Perform one more pop operation on the stack and print the value the pop method returns
        System.out.println( "\n- Delete this value using another pop() method: " + myStack.pop());
        //14. Call the top( ) method to print the element at the top of the stack
        System.out.println( "- Now the element at the top is: " + myStack.top());
        //15. Print the contents of the stack.
        System.out.println( "- Now the stack is: " + myStack.toString());
           
    }
}
