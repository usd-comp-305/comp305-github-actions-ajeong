package edu.sandiego.cs.comp305;

public class StringUtils {

    private StringUtils() {

    }

    public static String reverseString(final String input) {

        if (input == null || input.isEmpty()) {
            return input;
        }
        final StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }
}
