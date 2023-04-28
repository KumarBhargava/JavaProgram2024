package src;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int num, rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed: ");
        num = sc.nextInt();
        rev = reverse(num, rev);
        System.out.println("Reversed number is " + rev);
    }
    public static int reverse(int num, int rev) {
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        return rev;
    }
}
