package org.emresezer.D8;

/**
 * Given an array nums of size n, return the majority element.
 * <p>
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 * <p>
 * <p>
 * Input: nums = [3,2,3]
 * Output: 3
 * <p>
 * <p>
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 */


public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int majorElement = nums[0];
        int count = 1; // İlk elemanı zaten saydık
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == majorElement) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    majorElement = nums[i];
                    count = 1;
                }
            }
        }
        return majorElement;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,3};

        // Output: 3

        System.out.println(majorityElement(nums));

    }
}
