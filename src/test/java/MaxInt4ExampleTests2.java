/* CISC/CMPE 328, CISC 422
 * RIPR model, coverage and property-based testing: first examples
 */
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

// Coverage:
// - Input: ?
// - Structural:
//   . All tests together provide 100% line coverage (15/15) and 100% branch coverage (14/14)
public class MaxInt4ExampleTests2 {

    @Test
    void maxInt4Test2a() {
        int res = MaxInt4.maxInt4(4, 3, 2, 1);
        Assertions.assertThat(res).isEqualTo(4);
    }

    @Test
    void maxInt4Test2b() {
        int res = MaxInt4.maxInt4(3, 1, 2, 4);
        Assertions.assertThat(res).isEqualTo(4);
    }

    @Test
    void maxInt4Test2c() {
        int res = MaxInt4.maxInt4(2, 1, 3, 4);
        Assertions.assertThat(res).isEqualTo(4);
    }

    @Test
    void maxInt4Test2d() {
        int res = MaxInt4.maxInt4(1, 2, 3, 4);
        Assertions.assertThat(res).isEqualTo(4);
    }

    @Test
    void maxInt4Test2e() {
        int res = MaxInt4.maxInt4(1, 3, 2, 4);
        Assertions.assertThat(res).isEqualTo(4);
    }

    @Test
    void maxInt4Test2f() {
        int res = MaxInt4.maxInt4(1, 4, 2, 3);
        Assertions.assertThat(res).isEqualTo(4);
    }

    @Test
    void maxInt4Test2g() {
        int res = MaxInt4.maxInt4(1, 3, 4, 2);
        Assertions.assertThat(res).isEqualTo(4);
    }
    @Test
    void maxInt4Test2h() {  // test 8
        int res = MaxInt4.maxInt4(3, 1, 4, 2);
        Assertions.assertThat(res).isEqualTo(4);
    }
}
