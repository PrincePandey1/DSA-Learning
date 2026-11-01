package ComparatorUnderstanding;

import java.util.ArrayList;
import java.util.Arrays;

public class SortFirstElementfromPair {

    public static void main(String[] args) {
        int[][] pairs = {{3, 1}, {1, 2}, {2, 3}};
 
        // Descneding with first value of array
        Arrays.sort(pairs, (a, b) -> b[0] - a[0]);

       for (int[] pair : pairs) {
        System.out.println(Arrays.toString(pair));
       }
    
    }

}
