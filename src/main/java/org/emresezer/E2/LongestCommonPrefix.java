package org.emresezer.E2;

/**
 * <p>
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * <p>
 * <p>
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * <p>
 * <p>
 * ["cir","car"]
 * Output : "c"
 * <p>
 * <p>
 * Input: strs = ["flower","flower","flower","flower"]
 * Output: "flower"
 */

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }

        String prefix = strings[0];

        for (int i = 1; i < strings.length; i++) {
            while (strings[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                System.out.println(prefix);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] str = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }
}
