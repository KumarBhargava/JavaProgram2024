package src;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();

        if(isPalindrome(str)){
            System.out.println("String is palindrome");
        }else{
            String newPalindrome = makePalindrome(str);
            System.out.println("New Palindrome String is :"+newPalindrome);
        }
    }

    public static boolean isPalindrome(String str){
      String reversed = new StringBuilder(str).reverse().toString();
      return str.equalsIgnoreCase(reversed);
    }

    public static String makePalindrome(String str){
      String reversed = new StringBuilder(str).reverse().toString();
      return str+reversed;
    }
}
