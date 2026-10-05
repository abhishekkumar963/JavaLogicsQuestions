/*

Armstrong Number ⭐
Question: Check whether a number is an Armstrong number.

Input: 153
Output: Armstrong Number

1³ + 5³ + 3³ = 153

*/

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int digits = String.valueOf(n).length();
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}