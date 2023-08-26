package org.emresezer.D4;

import java.util.Enumeration;
import java.util.HashSet;

/**
 * Input: candyType = [1,1,2,2,3,3]
 * Output: 3
 * Explanation: Alice can only eat 6 / 2 = 3 candies. Since there are only 3 types, she can eat one of each type.
 * <p>
 * <p>
 * Input: candyType = [1,1,2,3]
 * Output: 2
 * Explanation: Alice can only eat 4 / 2 = 2 candies. Whether she eats types [1,2], [1,3], or [2,3], she still can only eat 2 different types.
 * <p>
 * <p>
 * Input: candyType = [6,6,6,6]
 * Output: 1
 * Explanation: Alice can only eat 4 / 2 = 2 candies. Even though she can eat 2 candies, she only has 1 type.
 */
public class DistributeCandies {

    public static int distributeCandies(int[] candyType) {
        int typeOfCandy = 0 ;
        int allCanEat = (candyType.length / 2) ;
        HashSet<Integer> hashSet = new HashSet<>(candyType.length);

        for(int i= 0 ; i<candyType.length ; i++){
            hashSet.add(candyType[i]);
        }
        if(hashSet.size() < allCanEat){
            allCanEat = hashSet.size();
        }

        return allCanEat;
    }


    public static void main(String[] args) {
        int[] candyType = new int[]{6, 6, 6, 6};
        System.out.println(distributeCandies(candyType));
    }
}
