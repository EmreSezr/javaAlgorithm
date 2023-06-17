package org.emresezer.C6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostUsedWords {

    public static void mostUsedLetters(String str) {
        Map<Character, Integer> list = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (list.containsKey(c)) {
                list.put(c, list.get(c) + 1);
            } else {
                list.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : list.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Tekrar Eden Harf= " + entry.getKey() + " : " + entry.getValue() + " defa");
            }
        }


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kelime Giriniz: ");
        String str = scanner.nextLine();
        mostUsedLetters(str);
    }
}
