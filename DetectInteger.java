/** 
 * Filename: DetectInteger.java
*/

/** 
 * Name: DetectInteger
 */
public class DetectInteger {
    public static void main(String[] args) {

        /* Test Case 1: Valid */
        String str = "3apple3";
        System.out.println(detectInt(str));

        /* Test Case 2: Invalid */
        String str2 = "banana";
        System.out.println(detectInt(str2));
    }

    /** 
     * Name: detectInt
     * Purpose: Detect whether string input consists of integer
     */
    public static boolean detectInt(String s) {

        for (int i = 0; i < s.length(); i++) {
            
            char c = s.charAt(i);
            
            /* Check if char represents a number */
            if (c >= '0' && c <= '9') {
                return true;
            }
        }

        return false;
    }

}
