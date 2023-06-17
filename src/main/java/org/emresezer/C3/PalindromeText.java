package org.emresezer.C3;

import java.util.Scanner;

public class PalindromeText {
    // Kelimelerin palindrom olup olmadığını kontrol etmek
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    //Alternatif StringBuilder Methodu
    public static String reverseText(String str) {
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        String reversedString = builder.toString();

        if (reversedString.equals(str)) {
            return "Yes";
        }
        return "No";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kelime Giriniz : ");
        String str = scanner.nextLine();

        if (isPalindrome(str)) {
            System.out.println(str + " bir palindromdur.");
        } else {
            System.out.println(str + " bir palindrom değildir.");
        }

        //Alternatif
        System.out.println(reverseText(str));
    }
}
