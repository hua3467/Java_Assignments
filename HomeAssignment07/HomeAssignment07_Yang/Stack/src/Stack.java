/**
 *
 * @author aaronyang
 */

public class Stack {
    
    private int [] list;
    private int count = 0;
    
    public Stack(){
        list = new int[5];
    }
    
    public Stack( int [] newList ){
        
        list = new int[ newList.length ];
        for( int i = 0; i < newList.length; i++ )
            list[i] = newList[i];
        count = newList.length;
    }
    
    public int size(){
        return count;
    }
    
    public void push( int n ){
        if( isFull() )
            addCapacity();
        
        list[ count + 1 ] = n;
        count++;
        
    } 
    
    public int pop() throws Exception{
        
        if( isEmpty() ){
            throw new Exception("the stack is empty, nothing could be poped. ");
        } else {
        int remove = list[list.length-1];
        list[list.length-1] = 0;
        count--;
        return remove;
        }
        
    }
    
    public int top (){
        return list[ list.length - 1 ];
    }

    private boolean isFull() {
        return count == list.length;
    }

    private void addCapacity() {
        int [] temp = new int [ list.length * 2 ];
        for( int i = 0; i < list.length; i++)
            temp[i] = list[i];
        list = temp;
        temp = null;
    }

    private boolean isEmpty() {
        return size() == 0;
    }
    
}
