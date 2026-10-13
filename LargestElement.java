/*

Find Largest Element in Array ⭐
Question: Find the largest element in an integer array.

*/

public class LargestElement {

    public static int findLargest(int[] arr) {
        int largest = arr[0];

        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 25, 8, 15};

        System.out.println(findLargest(arr));
    }
}