/* CISC/CMPE 422/835
 * Property-based testing: a first example
  * - maxPos: Finding the index of the maximum in an int array of length 4
 */
public class MaxPos {

    // a is assumed to contain exactly 4 ints!
    public static int maxPos(int[] a) {
        if (a[0] > a[1])
            if (a[0] > a[2])
                if (a[0] > a[3])
                    return 0;
                else
                    return 3;
            else if (a[2] > a[3])
                return 2;  // correct
//                return 0;  // bug 1
//                return 1;  // bug 2
//                return 2;  // bug 3
            else
                return 3;  // correct
//                return 0;  // bug 4
//                return 1;  // bug 5
//                return 2;  // bug 6
        else if (a[1] > a[2])
            if (a[1] > a[3])
                return 1;
            else
                return 3;
        else if (a[2] > a[3])
            return 2;
        else
            return 3;
    }

}

