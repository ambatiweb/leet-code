package com.vcb.leet.code.arrays;
/*
    You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
    Return the average salary of employees excluding the minimum and maximum salary.
    Answers within 10-5 of the actual answer will be accepted.

    Input: salary = [4000,3000,1000,2000]
    Output: 2500.00000
    Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
    Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
 */
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
