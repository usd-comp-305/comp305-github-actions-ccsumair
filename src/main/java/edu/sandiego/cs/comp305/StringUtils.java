package edu.sandiego.cs.comp305;

public final class StringUtils {

    private StringUtils() {

    }

    /**
     * Reverses the characters in a string.
     *
     * @param input the string to reverse
     * @return the reversed string
     */
    public static String reverseString(final String input) {

        // StringBuilder builds the reversed string.
        final StringBuilder reversedString = new StringBuilder();

        // Start at the end of the string and work toward the beginning.
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedString.append(input.charAt(i));
        }

        return reversedString.toString();
    }
}
