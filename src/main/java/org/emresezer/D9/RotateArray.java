package org.emresezer.D9;

import java.util.Arrays;

/**
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * <p>
 * <p>
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] rotatedArray = new int[n];

        for (int i = 0; i < n; i++) {
            rotatedArray[(i + k) % n] = nums[i];
        }
        System.out.println(Arrays.toString(rotatedArray));
    }


    public static void main(String[] args) {
        int[] nums = new int[]{-1, -100, 3, 99};
        int k = 2;
        //expected output : [3,99,-1,-100]
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(nums, k);
    }
}
