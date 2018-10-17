/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zhenhua.yang.1
 */
public class Questions {
    public static void main(String[] args)
    {
        int a = 1;
        double d = 1.0;
        
        d -= 1.5 * 3 + a++;
        
        System.out.println( "a = " + a );
        System.out.println( "d = " + d );
    }
}
