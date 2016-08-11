public class Solution {
  public boolean canConstruct(String ransomNote, String magazine) {
    char[] r = ransomNote.toCharArray();
    char[] m = magazine.toCharArray();
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    for(char ch : m){
        Integer count = map.get(ch);
        if(count == null) count = 0;
        map.put(ch, count+1);
    }
    for(char ch : r){
        Integer count = map.get(ch);
        if(count == null || count == 0) return false;
        map.put(ch, count-1);
    }
    return true;
    }
}