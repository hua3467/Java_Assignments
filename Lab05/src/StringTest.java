/**
 *
 * @author zhenhua.yang.1
 */
public class StringTest 
{
    public static void main( String [] args )
    {
        // create two string variables
        String str1 = "Hi";
        String str2 = "Hello World";

        // print the lengths of two strings
        System.out.println( "the lengthes of the two strings are: " + str1.length() 
                + " and " + str2.length() );

        // print the index of first occurrence of character ‘o’ in two strings
        System.out.println( "Index of the first occurrence of character ‘o’ in two strings: " 
                + str1.indexOf('o') + " and " + str2.indexOf('o') );

        // print the index of the last occurrence of character ‘o’ in both the strings
        System.out.println( "Index of the first occurrence of character ‘o’ in two strings: " 
                + str1.lastIndexOf('o') + " and " + str2.lastIndexOf('o') );

        // the subString of str2 begins after the white space
        String subString = str2.substring(6);
        System.out.println(subString);

        // print the concatenated string
        String concatenated = str1 + " " + subString;
        System.out.println( "The concatenated string is " + concatenated );

        // print the lower case of the string
        System.out.println( "Lower case: " + concatenated.toLowerCase() );

        // print the upper case of the string
        System.out.println( "Upper case: " + concatenated.toUpperCase() );
    }
    
}
