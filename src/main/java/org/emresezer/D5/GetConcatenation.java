package org.emresezer.D5;

/*
Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
Example 2:

Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]
 * */

import java.util.ArrayList;

public class GetConcatenation {
    public static int[] getConcatenation(int[] nums) {
        int[] nums2 = nums;
        ArrayList<Integer> array = new ArrayList<>();
        int[] concatArray = new int[nums.length*2];

        for (int i = 0; i < nums.length; i++) {
            array.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            array.add(nums[i]);
        }

        for(int i = 0; i<nums.length*2 ; i++){
            concatArray[i] = array.get(i);
        }
        return concatArray;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 2, 1};
        getConcatenation(nums);
    }
}
