/* CISC/CMPE 328, CISC 422
 * Property-based testing: a first example
 */
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxPosExampleTests2 {


    @Test
    void maxInt4Test2a() {
        int[] a = {4, 3, 2, 1};
        int res = MaxPos.maxPos(a);
 //       int res = MaxInt4.maxInt4(4, 3, 2, 1);
        Assertions.assertThat(res).isEqualTo(0);
    }

    @Test
    void maxInt4Test2b() {
        int[] a = {3, 1, 2, 4};
        int res = MaxPos.maxPos(a);
//        int res = MaxInt4.maxInt4(3, 1, 2, 4);
        Assertions.assertThat(res).isEqualTo(3);
    }

    @Test
    void maxInt4Test2c() {
            int[] a = {2, 1, 3, 4};
            int res = MaxPos.maxPos(a);
//        int res = MaxInt4.maxInt4(2, 1, 3, 4);
        Assertions.assertThat(res).isEqualTo(3);
    }

    @Test
    void maxInt4Test2d() {
                int[] a = {1, 2, 3, 4};
                int res = MaxPos.maxPos(a);
//        int res = MaxInt4.maxInt4(1, 2, 3, 4);
        Assertions.assertThat(res).isEqualTo(3);
    }

    @Test
    void maxInt4Test2e() {
                    int[] a = {1, 3, 2, 4};
                    int res = MaxPos.maxPos(a);
//        int res = MaxInt4.maxInt4(1, 3, 2, 4);
        Assertions.assertThat(res).isEqualTo(3);
    }

    @Test
    void maxInt4Test2f() {
                        int[] a = {1, 4, 2, 3};
                        int res = MaxPos.maxPos(a);
//        int res = MaxInt4.maxInt4(
        Assertions.assertThat(res).isEqualTo(1);
    }

    @Test
    void maxInt4Test2g() {
                            int[] a = {1, 3, 4, 2};
                            int res = MaxPos.maxPos(a);
//        int res = MaxInt4.maxInt4(1, 3, 4, 2);
        Assertions.assertThat(res).isEqualTo(2);
    }
    @Test
    void maxInt4Test2h() {  // test 8
                                int[] a = {3, 1, 4, 2};
                                int res = MaxPos.maxPos(a);
//        int res = MaxInt4.maxInt4(
        Assertions.assertThat(res).isEqualTo(2);
    }
    /*
    @Test
    void maxPosTest2a() {
        int[] a = {10,11,12,13};
        int res = MaxPos.maxPos(a);
        Assertions.assertThat(res).isEqualTo(3);
    }
    @Test
    void maxPosTest2() {
        int[] a = {10,11,13,12};
        int res = MaxPos.maxPos(a);
        Assertions.assertThat(res).isEqualTo(2);
    }
    @Test
    void maxPosTest3() {
        int[] a = {10,13,11,12};
        int res = MaxPos.maxPos(a);
       Assertions.assertThat(res).isEqualTo(1);
    }
    @Test
    void maxPosTest4() {
        int[] a = {13,10,11,12};
        int res = MaxPos.maxPos(a);
        Assertions.assertThat(res).isEqualTo(0);
    }
*/

}
