/*

Remove Duplicates from Array 
Question: Remove duplicate elements from an array.
Example:


Input:  [1, 2, 2, 3, 4, 4, 5]
Output: [1, 2, 3, 4, 5]

*/

import java.util.LinkedHashSet;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println(set);
    }
}