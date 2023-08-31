package src;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveDollar {
    public static void main(String[] args) {
        String costOfProduct = "$120";
        int numberOfProduct = 10;
        // Extract the numeric value using regular expression
        /*
        - The pattern \\d+ is used to match one or more digits in the string.
        - \\d: This is a special character sequence that represents any digit from 0 to 9.
        - +: This quantifier means "one or more occurrences.
        - So, the regular expression \\d+ matches one or more digits in the string.
          Then, the Pattern class is used to compile the regular expression pattern,
          and the Matcher class is used to perform the matching operation on the input string productCost.

          The find() method of the Matcher class is called to search for the next occurrence of the pattern in the input string. If a match is found, the find() method returns true, and we can retrieve the matched substring using the group() method.
          In this case, the matched substring will be the numeric value without the "$" symbol. We store this substring in the costString variable.

          Finally, we convert the costString to an integer using the Integer.parseInt() method and assign it to the cost variable.
          After removing the "$" symbol and converting the cost to an integer, you can perform calculations or further processing with the obtained value.
         */
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(costOfProduct);

        if(matcher.find()){
            String costString = matcher.group();
            int costInt = Integer.parseInt(costString);

            int totalPrice = numberOfProduct*costInt;
            System.out.println("Total Cost of the product is "+totalPrice);
        } else {
            System.out.println("Invalid Price format");
        }

    }
}
