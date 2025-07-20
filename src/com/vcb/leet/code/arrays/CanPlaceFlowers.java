package com.vcb.leet.code.arrays;
/*
    you have a long flowerbed in which some of the plots are planted, and some are not
    . However, flowers cannot be planted in adjacent plots.

    Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty,
    and an integer n, return if n new flowers can be planted in the flowerbed without violating
    the no-adjacent flowers rule.
 */

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] fBed = {1,0,0,0,1};
        int n = 1;

        System.out.println(canPlaceFlowers(fBed, n));
    }

    private static boolean canPlaceFlowers(int[] fBed, int n) {
        int count = 0;
        for (int i = 0; i < fBed.length; i++) {
            if(fBed[i] == 0){
                // closest left non-empty plot of i
                int left = i;
                while(left >= 0 && fBed[left] == 0){
                    left--;
                }
                int right = i;
                while(right < fBed.length && fBed[right] == 0){
                    right++;
                }
                if((left < 0 || i - left >=2) && (right >= fBed.length || right-i >=2) ){
                    count++;
                    fBed[i] = 1;
                }
                //
            }
        }
        return count >= n;
    }
}
