package src;

import java.util.Scanner;

public class PalindromeSecondApproach {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String input_string = sc.nextLine();
        String reversed_string = reverse_string(input_string);
        if(reversed_string.equalsIgnoreCase(input_string)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }

    static String reverse_string( String input_string){
        int size = input_string.length();
        String rev = "";
        for(int i = input_string.length()-1;i>=0;i--){
            rev = rev + input_string.charAt(i);
        }
        return rev;
    }
}
