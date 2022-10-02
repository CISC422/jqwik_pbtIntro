import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnitTests {
    @Test
    void maxIntTest1() {
        int res = Max.maxInt(1,2,3,4);
        Assertions.assertThat(res).isEqualTo(4);
    }
    @Test
    void maxIntTest2() {
        int res = Max.maxInt(1,2,4,3);
        Assertions.assertThat(res).isEqualTo(4);
    }
    @Test
    void maxIntTest3() {
        int res = Max.maxInt(1,4,2,3);
        Assertions.assertThat(res).isEqualTo(4);
    }
    @Test
    void maxIntTest4() {
        int res = Max.maxInt(4,1,2,3);
        Assertions.assertThat(res).isEqualTo(4);
    }

    @Test
    void maxPosTest1() {
        int[] a = {10,11,12,13};
        int res = Max.maxPos(a);
        Assertions.assertThat(res).isEqualTo(3);
    }
    @Test
    void maxPosTest2() {
        int[] a = {10,11,13,12};
        int res = Max.maxPos(a);
        Assertions.assertThat(res).isEqualTo(2);
    }
    @Test
    void maxPosTest3() {
        int[] a = {10,13,11,12};
        int res = Max.maxPos(a);
        Assertions.assertThat(res).isEqualTo(1);
    }
    @Test
    void maxPosTest4() {
        int[] a = {13,10,11,12};
        int res = Max.maxPos(a);
        Assertions.assertThat(res).isEqualTo(0);
    }


}
