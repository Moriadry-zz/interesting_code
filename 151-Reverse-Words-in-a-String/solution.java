public class Solution {
    public String reverseWords(String s) {
        String[] str = s.spilt(" ");
        StringBuilder result = new StringBuilder();
        for(int i=0; i< str.size; i++){
            int temp = str[i];
            str[i] = str[str.size-i];
            str[str.size-i] = temp;
            result.append(str[i] + " ");
        }
        return new String(result);
    }
}