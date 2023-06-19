package org.emresezer.C8;

import java.util.*;

public class SingleNumberInArray {
    // Dizilerdeki tekrarı olmayan sayıları yazdırma

    public static int singleNumbers(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return set.iterator().next();
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi Boyutu: ");
        int arrayLength = scanner.nextInt();
        int[] list = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.print((i + 1) + ". Sayı Gir:  ");
            list[i] = scanner.nextInt();
        }
        System.out.print("Tekrar Etmeyen Eleman : " + singleNumbers(list));
        scanner.close();
    }
}
