package src;

import java.util.Scanner;

public class DivideStringIntoWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String input_string = sc.nextLine();
        convertIntoWords(input_string);
    }

    public static void convertIntoWords(String input_string){
        String [] words = input_string.split("\\s");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
