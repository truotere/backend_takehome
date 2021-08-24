/** 
 * Filename: StringToInt.java
*/

/** 
 * Name: StringToInt
 */
public class StringToInt {
    public static void main(String[] args) {

        /* Test Case 1: Valid */
        String str = "679263";
        System.out.println(stringToInt(str));

        /* Test Case 2: Invalid */
        String str2 = "aaabbb3";
        System.out.println(stringToInt(str2));
    }

    /** 
     * Name: stringToInt
     * Purpose: Convert a string input into integer
     */
    public static int stringToInt(String s) {

        int result = 0, digit = 1, factor = 1;
        char c;

        for (int i = s.length() - 1; i >= 0; i--) {
            
            c = s.charAt(i);

            /* Check if char represents a number */
            if (c < '0' || c > '9') {
                return -1;
            }

            digit = c - '0';
            result += digit * factor;
            factor *= 10;
        }

        return result;
    }

}


