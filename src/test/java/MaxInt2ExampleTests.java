/* CISC/CMPE 422/835
 * RIPR model, coverage and property-based testing: first examples
 */
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

// Each test on its own provides 100% line (4/4) coverage and 50% (1/2) branch coverage
// Test1 and (Test2 or Test3) provide 100% branch coverage
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
