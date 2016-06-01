package ReverseString;

public class Solution {

    //first way 2ms, while the second 3ms
    public String reverseStringSmart(String s) {
        if (s == null) {
            return null;
        }
        char[] arr = s.toCharArray();
        int left=0, right=arr.length-1;
        while(left<right){
            char tmp=arr[left];
            arr[left] = arr[right];
            arr[right]=tmp;
            left++;
            right--;
        }

        return new String(arr);
    }
    public static String reverseStringSilly(String s) {
        char[] reverseChar = s.toCharArray();
        char[] destChar = new char[reverseChar.length];
        for (int i = 0; i < reverseChar.length; i++) {
            destChar[i] = reverseChar[reverseChar.length - 1 - i];
        }
        return destChar.toString();
    }
}
