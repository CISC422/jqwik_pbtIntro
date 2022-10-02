import net.jqwik.api.*;
import net.jqwik.api.constraints.IntRange;
import net.jqwik.api.constraints.Positive;
import net.jqwik.api.constraints.Size;
import net.jqwik.api.constraints.UniqueElements;
import org.assertj.core.api.Assertions;

public class Properties {

    @Property
    @Report(Reporting.GENERATED)
    void prop1(@ForAll @Positive int x1, @ForAll @Positive int x2, @ForAll @Positive int x3, @ForAll @Positive int x4) {
        int res = Max.maxInt(x1, x2, x3, x4);
        Assertions.assertThat(res).isGreaterThanOrEqualTo(x1);
        Assertions.assertThat(res).isGreaterThanOrEqualTo(x2);
        Assertions.assertThat(res).isGreaterThanOrEqualTo(x3);
        Assertions.assertThat(res).isGreaterThanOrEqualTo(x4);
    }
    @Property
    @Report(Reporting.GENERATED)
    void maxIntProp2(@ForAll @IntRange(min=1, max=4) int x1, @ForAll @IntRange(min=1, max=4)int x2, @ForAll @IntRange(min=1, max=4) int x3, @ForAll @IntRange(min=1, max=4) int x4) {
        int res = Max.maxInt(x1, x2, x3, x4);
        Assertions.assertThat(res).isGreaterThanOrEqualTo(x1);
        Assertions.assertThat(res).isGreaterThanOrEqualTo(x2);
        Assertions.assertThat(res).isGreaterThanOrEqualTo(x3);
        Assertions.assertThat(res).isGreaterThanOrEqualTo(x4);
    }

    @Property
    @Report(Reporting.GENERATED)
//    void maxPosProp1(@ForAll("myIntArrays") @Size(4) @UniqueElements int[] a) {
//    void maxPosProp1(@ForAll("myIntArrays") @Size(4) int[] a) {
        void maxPosProp1(@ForAll @Size(4) int[] a) {
        int res = Max.maxPos(a);
        Assertions.assertThat(a[res]).isGreaterThanOrEqualTo(a[0]);
        Assertions.assertThat(a[res]).isGreaterThanOrEqualTo(a[1]);
        Assertions.assertThat(a[res]).isGreaterThanOrEqualTo(a[2]);
        Assertions.assertThat(a[res]).isGreaterThanOrEqualTo(a[3]);
    }
    @Provide
    Arbitrary<int[]> myIntArrays() {
        return Arbitraries.integers().between(10,13).array(int[].class);
    }

}
