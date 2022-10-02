/* CISC/CMPE 422/835
 * Property-based testing: a first example
 * Finding the maximum among 4 integers (maxInt)
 * Finding the index of the maximum in an int array of length 4
 */
public class Max {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int maxInt(int x1, int x2, int x3, int x4) {
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
                return x4;
        else if (x3 > x4)
            return x3;
        else
            return x4;
    }

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

