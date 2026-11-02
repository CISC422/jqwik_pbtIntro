/* CISC/CMPE 328, CISC 422
 * RIPR model, coverage and property-based testing: first examples
 * - maxInt2: Finding the maximum among 2 integers
 */
public class MaxInt2 {
    public static int maxInt2(int x1, int x2) {
        if (x1>x2)
            return x1;
        else
            return x2;
    }
}

