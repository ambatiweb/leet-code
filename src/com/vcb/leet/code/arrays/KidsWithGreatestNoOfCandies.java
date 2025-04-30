package com.vcb.leet.code.arrays;

public class KidsWithGreatestNoOfCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        boolean[] result = kidsWithCandies(candies, extraCandies);

        for (boolean canHaveMost : result) {
            System.out.print(canHaveMost + " ");
        }
    }

    public static boolean[] kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = Integer.MIN_VALUE;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }

        boolean[] result = new boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            result[i] = (candies[i] + extraCandies >= maxCandies);
        }

        return result;
    }
}
