/* CISC/CMPE 422/835
 * Property-based testing: a first example
 */

import net.jqwik.api.*;
import net.jqwik.api.constraints.IntRange;
import net.jqwik.api.constraints.Positive;
import net.jqwik.api.constraints.Size;
import net.jqwik.api.constraints.UniqueElements;
import org.assertj.core.api.Assertions;

import java.util.Arrays;

public class Properties {

    @Property
    @Report(Reporting.GENERATED)
//   void maxIntProp(@ForAll int x1, @ForAll int x2, @ForAll int x3, @ForAll int x4) {
//   void maxIntProp(@ForAll @Positive int x1, @ForAll @Positive int x2, @ForAll @Positive int x3, @ForAll @Positive int x4) {
   void maxIntProp(@ForAll @IntRange(min=1, max=4) int x1,
                     @ForAll @IntRange(min=1, max=4) int x2,
                     @ForAll @IntRange(min=1, max=4) int x3,
                     @ForAll @IntRange(min=1, max=4) int x4) {
        int res = Max.maxInt(x1, x2, x3, x4);
        Assertions.assertThat(res).isGreaterThanOrEqualTo(x1);
        Assertions.assertThat(res).isGreaterThanOrEqualTo(x2);
        Assertions.assertThat(res).isGreaterThanOrEqualTo(x3);
        Assertions.assertThat(res).isGreaterThanOrEqualTo(x4);
    }

    @Property
    @Report(Reporting.GENERATED)
    void maxPosProp(@ForAll("myIntArrays") @UniqueElements int[] a) {
//   void maxPosProp(@ForAll("myIntArrays") int[] a) {
//    void maxPosProp(@ForAll @Size(4) int[] a) {
        // Assume.that(a[0]==10 && a[1]==11);
        int res = Max.maxPos(a);
        Assertions.assertThat(a[res]).isGreaterThanOrEqualTo(a[0]);
        Assertions.assertThat(a[res]).isGreaterThanOrEqualTo(a[1]);
        Assertions.assertThat(a[res]).isGreaterThanOrEqualTo(a[2]);
        Assertions.assertThat(a[res]).isGreaterThanOrEqualTo(a[3]);
    }

    // generates arrays of ints containing 10, 11, 12, or 13
    @Provide
    Arbitrary<int[]> myIntArrays() {
        return Arbitraries.integers().between(10,13).array(int[].class).ofSize(4);
    }

    @Property
    void checkMyIntArraysProp(@ForAll("myIntArrays") int[] a) {
        System.out.println(Arrays.toString(a));
    }

}
