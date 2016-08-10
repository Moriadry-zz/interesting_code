public class Solution {
    public boolean canWinNim(int n) {
        if(1<= n <=3) {
            return true;
        } else if(n ==4 ) {
            return false;
        } else {
            return canWinNim(n--);
        }
    }
}