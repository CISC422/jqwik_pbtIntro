/* CISC/CMPE 422/835
 * RIPR model, coverage and property-based testing: first examples
 * - findLast: return largest index i such that array[i] == element, -1 otherwise
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// tests test1, test2, and test3 together provide 100% line and branch coverage
public class FindLastExampleTests {
    @Test
    void test1() {  // does not reach (coverage: 1/4 line, 0/4 branch)
        assertThrows(NullPointerException.class, ()-> FindLast.findLast(null, 2));
    }
    @Test
    void test2() {  // reaches, but does not infect (coverage: 3/4 line, 2/4 branch)
        int res = FindLast.findLast(new int[]{0, 1, 2}, 2);
        assertEquals(2,res);
    }
    @Test
    void test3() {  // reaches and infects, but does not propagate (coverage: 3/4 line, 3/4 branch)
        int res = FindLast.findLast(new int[]{0, 1, 2}, 3);
        assertEquals(-1,res);
    }
    @Test
    void test4() {  // reaches, infects, and propagates, but does not reveal (coverage: 3/4 line, 3/4 branch)
        assertDoesNotThrow(() -> FindLast.findLast(new int[]{0, 1, 2}, 0));
    }
    @Test
    void test5() {  // reaches, infects, progates, and reveals (coverage: 3/4 line, 3/4 branch)
        int res = FindLast.findLast(new int[]{0, 1, 2}, 0);
        assertEquals(0,res);
    }
    @Test
    void test6() {  // reaches, infects, progates, and reveals (coverage: 3/4 line, 3/4 branch)
        int res = FindLast.findLast(new int[]{0, 0, 1, 0}, 1);
        assertEquals(2,res);
    }
}
