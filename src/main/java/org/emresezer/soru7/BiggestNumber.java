package org.emresezer.soru7;

public class BiggestNumber {

    public static int findMax(int[] numbers) {
        // Dizideki en büyük sayıyı yazdırma
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max)
                max = number;
        }
        return max;
    }

    public static void main(String[] args) {
        //BiggestNumber biggestNumber = new BiggestNumber();
        int[] arr = {1, 5, 10, 20, 30, 25};
        // biggestNumber.findMax(arr);
        System.out.println(BiggestNumber.findMax(arr));
    }

}
