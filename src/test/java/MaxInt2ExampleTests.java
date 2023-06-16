/* CISC/CMPE 422/835
 * Property-based testing: a first example
 */
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxInt2ExampleTests {

    @Test
    void maxInt2Test1() {
        int res = MaxInt2.maxInt2(1,2);
        Assertions.assertThat(res).isEqualTo(2);
    }
    @Test
    void maxInt2Test2() {
        int res = MaxInt2.maxInt2(2,1);
        Assertions.assertThat(res).isEqualTo(2);
    }
    @Test
    void maxInt2Test3() {
        int res = MaxInt2.maxInt2(1,1);
        Assertions.assertThat(res).isEqualTo(1);
    }

}
