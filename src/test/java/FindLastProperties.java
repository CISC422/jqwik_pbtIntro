/* CISC/CMPE 422/835
 * RIPR model, coverage and property-based testing: first examples
 */

import net.jqwik.api.*;
import net.jqwik.api.constraints.IntRange;
import net.jqwik.api.constraints.UniqueElements;
import org.assertj.core.api.Assertions;

import java.util.Arrays;

public class FindLastProperties {

    static final int minInt = 0;
    static final int maxInt = 3;

    // fails with, e.g., 100 tries
    @Property
    @Report(Reporting.GENERATED)
   void findLastProp(@ForAll("myIntArrays") int[] a,
                     @ForAll @IntRange(min=minInt, max=maxInt) int e) {
        int res = FindLast.findLast(a, e);
        System.out.println("==>> findLast("+Arrays.toString(a)+", "+e+") = "+res);
        if (res >= 0) {
            Assertions.assertThat(a[res]).isEqualTo(e);
            for (int i = res+1; i<a.length; i++)
                Assertions.assertThat(a[i]).isNotEqualTo(e);
        } else
            for (int i = 0; i<a.length; i++)
                Assertions.assertThat(a[i]).isNotEqualTo(e);
    }

    // generates arrays of ints containing minInt, ..., maxInt
    @Provide
    Arbitrary<int[]> myIntArrays() {
        return Arbitraries.integers().between(minInt,maxInt).array(int[].class).ofSize(maxInt-minInt+1);
    }

    @Property
    void checkMyIntArraysProp(@ForAll("myIntArrays") int[] a) {
        System.out.println(Arrays.toString(a));
    }

}
