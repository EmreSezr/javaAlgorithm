package org.emresezer.C9;
import java.util.Scanner;

public class FillTheQuestionMark {
    public static void main(String[] args) {
        /*
        Example usage:
                Input: ??la
                Substring: c o
                Output: cola
                If the number of question marks is greater than the number of substrings,
                the output will be -1.
        * */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String input = scanner.nextLine();

        System.out.print("Substring: ");
        String substring = scanner.nextLine();

        int questionMarkCount = countQuestionMarks(input);
        int substringCount = countSubstring(substring);

        if (questionMarkCount < substringCount) {
            System.out.println("-1");
        } else {
            String output = fillQuestionMarks(input, substring);
            System.out.println("Output: " + output);
        }
    }

    private static int countQuestionMarks(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '?') {
                count++;
            }
        }
        return count;
    }

    private static int countSubstring(String substring) {
        int count = 0;
        for (int i = 0; i < substring.length(); i++) {
            if (substring.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }

    private static String fillQuestionMarks(String input, String substring) {
        StringBuilder output = new StringBuilder(input);
        int subIndex = 0;

        for (int i = 0; i < output.length(); i++) {
            if (output.charAt(i) == '?') {
                if (subIndex < substring.length()) {
                    output.setCharAt(i, substring.charAt(subIndex));
                    subIndex++;
                } else {
                    output.setCharAt(i, '-');
                }
            }
        }

        return output.toString();
    }
}