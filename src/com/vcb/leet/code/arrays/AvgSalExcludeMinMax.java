package com.vcb.leet.code.arrays;

public class AvgSalExcludeMinMax {
    public static void main(String[] args) {
        int[] salary = {4000, 3000, 1000, 2000};
        System.out.println(average(salary)); // Output: 2500.00000
    }

    public static double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double sum = 0;

        for (int s : salary) {
            if (s < min) {
                min = s;
            }
            if (s > max) {
                max = s;
            }
            sum += s;
        }

        return (sum - min - max) / (salary.length - 2);
    }
}
