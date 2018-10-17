/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kotala
 */
public class Test
{
    public static void main(String[] args)
    {
        int x = 0;
        while(x < 5)
        {
            if(x == 3)
            {
               continue;
            }
            System.out.println(x);
            x++;
                   
        }
        
        System.out.println(x);
        
    }
}
