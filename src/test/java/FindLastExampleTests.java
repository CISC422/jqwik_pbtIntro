import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FindLastExampleTests {
    @Test
    void test1() {  // does not reach
        assertThrows(NullPointerException.class, ()-> FindLast.findLast(null, 2));
    }
    @Test
    void test2() {  // reaches, but does not infect
        int res = FindLast.findLast(new int[]{0, 1, 2}, 2);
        assertEquals(2,res);
    }
    @Test
    void test3() {  // reaches and infects, but does not propagate
        int res = FindLast.findLast(new int[]{0, 1, 2}, 3);
        assertEquals(-1,res);
    }
    @Test
    void test4() {  // reaches, infects, and propagates, but does not reveal
        assertDoesNotThrow(() -> FindLast.findLast(new int[]{0, 1, 2}, 0));
    }
    @Test
    void test5() {  // reaches, infects, progates, and reveals
        int res = FindLast.findLast(new int[]{0, 1, 2}, 0);
        assertEquals(0,res);
    }
}
