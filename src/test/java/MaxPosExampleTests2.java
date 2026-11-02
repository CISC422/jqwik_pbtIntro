/* CISC/CMPE 328, CISC 422
 * Property-based testing: a first example
 */
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxPosExampleTests2 {

    @Test
    void maxInt4Test2a() {
        int[] a = {13, 12, 11, 10};
        int res = MaxPos.maxPos(a);
        Assertions.assertThat(res).isEqualTo(0);
    }

    @Test
    void maxInt4Test2b() {
        int[] a = {12, 10, 11, 13};
        int res = MaxPos.maxPos(a);
        Assertions.assertThat(res).isEqualTo(3);
    }

    @Test
    void maxInt4Test2c() {
        int[] a = {11, 10, 12, 13};
        int res = MaxPos.maxPos(a);
        Assertions.assertThat(res).isEqualTo(3);
    }

    @Test
    void maxInt4Test2d() {
        int[] a = {10, 11, 12, 13};
        int res = MaxPos.maxPos(a);
        Assertions.assertThat(res).isEqualTo(3);
    }

    @Test
    void maxInt4Test2e() {
        int[] a = {10, 12, 11, 13};
        int res = MaxPos.maxPos(a);
        Assertions.assertThat(res).isEqualTo(3);
    }

    @Test
    void maxInt4Test2f() {
        int[] a = {10, 13, 11, 12};
        int res = MaxPos.maxPos(a);
        Assertions.assertThat(res).isEqualTo(1);
    }

    @Test
    void maxInt4Test2g() {
        int[] a = {10, 12, 13, 11};
        int res = MaxPos.maxPos(a);
        Assertions.assertThat(res).isEqualTo(2);
    }
    @Test
    void maxInt4Test2h() {  // test 8
        int[] a = {12, 10, 13, 11};
        int res = MaxPos.maxPos(a);
        Assertions.assertThat(res).isEqualTo(2);
    }

}
