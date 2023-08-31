package src;

import java.util.Scanner;

public class FindTheLargestNumberOutOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number :");
        int num1 = sc.nextInt();
        System.out.println("Please enter the second number :");
        int num2 = sc.nextInt();
        System.out.println("Please enter the third number :");
        int num3 = sc.nextInt();
        int largestnum = findthelargestnumber(num1, num2 , num3);
        System.out.println("The largest number out of three is "+largestnum);

    }

    public static int findthelargestnumber(int a,int b,int c){
        int largest = a;
        if(b>largest){
            largest = b;
        }
        if(c>largest){
            largest =c;
        }
        return largest;
    }
}
