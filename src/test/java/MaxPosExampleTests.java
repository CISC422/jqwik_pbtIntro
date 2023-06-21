/* CISC/CMPE 422/835
 * Property-based testing: a first example
 */
import org.junit.jupiter.api.Test;

public class MaxPosExampleTests {

    @Test
    void maxPosTest1() {
        int[] a = {10,11,12,13};
//        int res = MaxPos.maxPos(a);
//        Assertions.assertThat(res).isEqualTo(3);
    }
    @Test
    void maxPosTest2() {
        int[] a = {10,11,13,12};
//        int res = MaxPos.maxPos(a);
//        Assertions.assertThat(res).isEqualTo(2);
    }
    @Test
    void maxPosTest3() {
        int[] a = {10,13,11,12};
//        int res = MaxPos.maxPos(a);
//       Assertions.assertThat(res).isEqualTo(1);
    }
    @Test
    void maxPosTest4() {
        int[] a = {13,10,11,12};
//        int res = MaxPos.maxPos(a);
//        Assertions.assertThat(res).isEqualTo(0);
    }


}
