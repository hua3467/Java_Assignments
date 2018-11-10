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
        count++;
        list[count-1] = n;

    } 
    
    public int pop(){
        
        if( isEmpty() ){
            return -1;
        } else {
        int remove = list[count - 1];
        count--;
        return remove;
        }
        
    }
    
    public int top (){
        return list[ count - 1 ];
    }
    
    public int maxValue (){
        int max = 0;
        for( int i = 0; i < count; i++ ){
            if( max < list[i])
                max = list[i];
        }
        return max;
    }
    
    public int[] getList(){
        int[] newList = new int[count];
        for( int i = 0; i < count; i++ )
            newList[i] = list[i];
        return newList;
    }

    private boolean isFull() {
        return count == list.length;
    }

    private void addCapacity() {
        int [] temp = new int [ list.length * 2 ];
        for( int i = 0; i < list.length; i++)
            temp[i] = list[i];
        list = temp;
    }

    private boolean isEmpty() {
        return size() == 0;
    }
    
    @Override
    public String toString(){
        String str = "";
        
        for( int i = 0; i < count; i++ ){
            str += list[i] + "    ";
        }
        
        return str;
    }
    
    @Override
    public boolean equals( Object s ){
        
        if( !( s instanceof Stack ) )
            return false;
        else{
            Stack objStack = (Stack) s;
            String str = "";
            for( int i = 0; i < objStack.size(); i++ ){
                
                if( objStack.getList()[i] != list[i] )
                    return false;
            }
            return true;
        }
                
    }
    
}
