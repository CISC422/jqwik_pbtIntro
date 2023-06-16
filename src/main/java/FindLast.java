public class FindLast {
    public static int findLast(int[] array, int element) {
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] == element)
                return i;
        }
        return -1;
    }
//        for (int i = array.length - 1; i > 0 ; i--) {             if(array[i] == element)                 return i;         }         return -1;
/*        for (int i = array.length - 1;
             i > 0 ;
             i--) {
            if (array[i] == element)
                return i;
        }
        return -1;
    }
*/
}
