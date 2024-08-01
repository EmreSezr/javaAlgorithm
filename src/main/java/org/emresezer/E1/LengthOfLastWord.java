package org.emresezer.E1;

/**
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * <p>
 * Input: s = "Hello World"
 * Output: 5
 * <p>
 * <p>
 * <p>
 * Input: s = "   fly me   to   the moon  "
 * Output: 4
 * <p>
 * <p>
 * Input: s = "luffy is still joyboy"
 * Output: 6
 */


public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        String word1 = "Hello World";
        System.out.println(lengthOfLastWord(word1));
    }
}