/* CISC/CMPE 422/835
 * Property-based testing: a first example
 * - maxInt2: Finding the maximum among 2 integers
   */
public class MaxInt2 {
    public static int maxInt2(int x1, int x2) {
        int res = x1;
        if (x2>x1)
            res = x2;
        return res;
    }
}

