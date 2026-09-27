/*

Move All Zeros to End

Question: Move all zero elements to the end while maintaining the order of non-zero elements.

Input:
6
0 1 0 3 12 0

Output:
1 3 12 0 0 0

*/

import java.util.Scanner;
import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = 0;

        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        while (index < n) {
            arr[index++] = 0;
        }

        System.out.println("Result: " + Arrays.toString(arr));

        sc.close();
    }
}