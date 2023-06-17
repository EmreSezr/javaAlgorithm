package org.emresezer.C7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    /*  Sayı sayma programı eğer:
            -3'ün katlarına gelirse "Fizz"
            -5'in katlarına gelirse "Buzz"
            -Hem 3 hem 5'in katıysa "FizzBuzz" deniliyor
    * */

    public static List<String> fizzBuzzCount(int count) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= count; i++) {
            if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                list.add(" FizzBuzz ");
            } else if (i % 5 == 0) {
                list.add(" Buzz ");
            } else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        int count = scanner.nextInt();
        System.out.print(fizzBuzzCount(count));
        scanner.close();
    }
}
