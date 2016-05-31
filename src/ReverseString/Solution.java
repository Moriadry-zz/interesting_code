package ReverseString;

public class Solution {

    public static String reverseString(String s) {
        char[] reverseChar = s.toCharArray();
        char[] destChar = new char[reverseChar.length];
        for (int i = 0; i < reverseChar.length; i++) {
            destChar[i] = reverseChar[reverseChar.length - 1 - i];
        }
        return destChar.toString();
    }
}
