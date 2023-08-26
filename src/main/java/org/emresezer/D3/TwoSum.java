package org.emresezer.D3;

/*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
*
* */

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] targetedArr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && (i != j)) {
                    targetedArr[0] = j;
                    targetedArr[1] = i;
                }
            }
        }
        return targetedArr;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        int[] finding = twoSum(nums, target);
        for (int numbers : finding) {
            System.out.println(numbers);
        }
    }
}