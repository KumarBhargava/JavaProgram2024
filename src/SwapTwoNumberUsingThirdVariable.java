package src;

import java.util.Scanner;

public class SwapTwoNumberUsingThirdVariable {

    public static int first_num;
    public static int second_num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number to swap: ");
        first_num = sc.nextInt();
        System.out.println("Enter second number to swap: ");
        second_num = sc.nextInt();
        System.out.println("Two number before swapping are:"+first_num+ " and "+second_num);
        int temp = first_num;
        first_num = second_num;
        second_num = temp;
        System.out.println("After swapping two numbers are "+first_num+" and "+second_num);
    }
}
