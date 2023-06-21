/* CISC/CMPE 422/835
 * RIPR model, coverage and property-based testing: first examples
  * - maxInt4: Finding the maximum among 4 integers
  */
public class MaxInt4 {
    public static int maxInt4(int x1, int x2, int x3, int x4) {
        if (x1 > x2)
            if (x1 > x3)
                if (x1 > x4)
                    return x1;
                else
                    return x4;
            else if (x3 > x4)
                return x3;  // correct
//                return x1;  // bug 1
//                return x2;  // bug 2
//                return x3;  // bug 3
            else
                return x4;  // correct
//                return x1;  // bug 4
//                return x2;  // bug 5
//                return x3;  // bug 6
        else if (x2 > x3)
            if (x2 > x4)
                return x2;
            else
                return x4;  // correct
//              return x1;  // bugs 7, 8, 9
        else if (x3 > x4)
            return x3;
        else
            return x4;
    }
}

