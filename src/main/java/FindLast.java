/* CISC/CMPE 422/835
 * RIPR model, coverage and property-based testing: first examples
 * - findLast: return largest index i such that array[i] == element, -1 otherwise
 */
public class FindLast {
    public static int findLast(int[] array, int element) {
        for (int i = array.length-1; i>0; i--) {       // bug: should be 'i>=0'
            if (array[i] == element)
                return i;
        }
        return -1;
    }
/*  reformatting to artificially increase line coverage
        for (int i = array.length - 1; i > 0 ; i--) {             if(array[i] == element)                 return i;         }         return -1;
 */
/*  reformatting to make 'line coverage' simulate 'statement coverage'
      for (int i = array.length - 1;
             i > 0 ;
             i--) {
            if (array[i] == element)
                return i;
        }
        return -1;
    }
*/
}
