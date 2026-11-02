/* CISC/CMPE 328, CISC 422
 * Property-based testing: a first example
 */
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxPosExampleTests1 {

    @Test
    void maxPosTest1a() {
        int[] a = {10,11,12,13};
        int res = MaxPos.maxPos(a);
        Assertions.assertThat(res).isEqualTo(3);
    }
    @Test
    void maxPosTest1b() {
        int[] a = {10,11,13,12};
        int res = MaxPos.maxPos(a);
        Assertions.assertThat(res).isEqualTo(2);
    }
    @Test
    void maxPosTest1c() {
        int[] a = {10,13,11,12};
        int res = MaxPos.maxPos(a);
       Assertions.assertThat(res).isEqualTo(1);
    }
    @Test
    void maxPosTest1d() {
        int[] a = {13,10,11,12};
        int res = MaxPos.maxPos(a);
        Assertions.assertThat(res).isEqualTo(0);
    }


}
