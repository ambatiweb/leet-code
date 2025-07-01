package com.vcb.leet.code.binary;

public class SumOfIntegers {
    public static void main(String[] args) {
        int a = 5;
        int b = 14;

        System.out.println(getSum(a,b));
    }

    private static int getSum(int a, int b) {

        while(b != 0){
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        return a;
    }
} // TC: O(1), SC: O(1)
