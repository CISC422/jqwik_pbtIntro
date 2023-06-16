/* CISC/CMPE 422/835
 * Property-based testing: a first example
 */
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxInt4ExampleTests {

    @Test
    void maxInt4Test1() {
        int res = MaxInt4.maxInt4(1,2,3,4);
        Assertions.assertThat(res).isEqualTo(4);
    }
    @Test
    void maxInt4Test2() {
        int res = MaxInt4.maxInt4(1,2,4,3);
        Assertions.assertThat(res).isEqualTo(4);
    }
    @Test
    void maxInt4Test3() {
        int res = MaxInt4.maxInt4(1,4,2,3);
        Assertions.assertThat(res).isEqualTo(4);
    }
    @Test
    void maxInt4Test4() {
        int res = MaxInt4.maxInt4(4,1,2,3);
        Assertions.assertThat(res).isEqualTo(4);
    }

}
