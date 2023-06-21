/* CISC/CMPE 422/835
 * RIPR model, coverage and property-based testing: first examples
 */
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

// Coverage:
// - Input: each of the four input parameters holds the maximum exactly once
// - Structural:
//   . All tests together provide 66% line coverage (10/15) and 64% branch coverage (9/14)
//   . Alone, each test provides 27% line coverage (4/15) and 21% branch coverage (3/14)
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
