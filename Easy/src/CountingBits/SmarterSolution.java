package CountingBits;

/**
 * Created by dingpeng on 16/8/9.
 */

/*This uses the hint from the description about using ranges. Basically, the numbers in one range are equal to 1 plus

 all of the numbers in the ranges before it. If you write out the binary numbers, you can see that numbers 8-15 have

 the same pattern as 0-7 but with a 1 at the front.

    My logic was to copy the previous values (starting at 0) until a power of 2 was hit (new range), at which point we

  just reset the t pointer back to 0 to begin the new range.

  */

public class SmarterSolution {
    public int[] countBits(int num) {
        int[] ret = new int[num + 1];
        ret[0] = 0;
        int pow = 1;
        for (int i = 1, t = 0; i <= num; i++, t++) {
            if (i == pow) {
                pow *= 2;
                t = 0;
            }
            ret[i] = ret[t] + 1;
        }
        return ret;
    }
}
