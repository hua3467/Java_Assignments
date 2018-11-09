/**
 *
 * @author aaronyang
 */
public class Queue {
    private int[] list;
    private int count = 0;
    
    /**
     * default constructor of the queue, 
     * initializes the list instance variable to an array of length 5
     */
    public Queue( ){
        list = new int[5];
    }
    
    /**
     * overloaded constructor that takes an int array as a parameter.
     * @param arr
     */
    public Queue( int [] arr ){
        list = arr;
        count = arr.length;
    }
    
    /**
     * accessor method
     * @return count is the size of the current queue.
     */
    public int getCount(){
        return count;
    }
    /**
     * accessor method
     * @return all the elements of the queue in a array. 
     */
    public int[] getList(){
        return list;
    }
    
    /**
     * 
     * @param newValue 
     */
    public void enqueue( int newValue ){
        
        if( count == list.length ){
            addCapacity();
        }
        list[count] = newValue;
        count++;
    }
    
    /**
     * remove the first element of the queue
     * @return removed value
     */
    public int dequeue(){
        int removed = list[0];
        for( int i = 0; i < count; i++ ){
            list[i] = list[i+1];
        }
        count--;
        return removed;
    }
    
    /**
     * 
     * @return max value of the queue
     */
    public int maxValue(){
        int max = 0;
        for( int i = 0; i < count; i++){
            if( max < list[i] )
                max = list[i];
        }
        return max;
    }
    /**
     * double the size of the queue
     */
    private void addCapacity(){
        int [] temp = new int[ list.length * 2 ];
        for( int i = 0; i < count; i++ )
            temp[i] = list[i];
        list = temp;
    }
    
    /**
     *
     * @return all the elements that have been added to the queue
     */
    @Override
    public String toString(){
        String str = "";
        for ( int i = 0; i < count; i++ )
            str += list[i] + "    ";
        return str;
    }
    /**
     * check if two queues are the same
     * @param l is the queue that is going to be compared.
     * @return true if two queues are the same, or false if two queues are not the same.
     */
    public boolean equals( Queue l ){
        if( l.getCount() != count )
            return false;
        else{
            for( int i = 0; i < count; i++ ){
                if( l.getList()[i] != list[i] )
                    return false;
            }
            return true;
        }
    }
    
}
