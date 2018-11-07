/**
 *
 * @author aaronyang
 */
public class Queue {
    private int[] list;
    private int count = 0;
    
    public Queue( ){
        list = new int[5];
    }
    
    public Queue( int [] arr, int n){
        list = arr;
        count = n;
    }
}
