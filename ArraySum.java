/*

Sum of Array Elements

Question: Find the sum of all elements in an array.


Input:
5
10 20 30 40 50

Output:
150
*/

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int sum = 0;

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }

        System.out.println("Sum: " + sum);

        sc.close();
    }
}

