package edu.sandiego.cs.comp305;

public class StringUtils {

    public static String reverseString(String input) {

        if (input == null || input.isEmpty()) {
            return input;
        }
        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }
}
