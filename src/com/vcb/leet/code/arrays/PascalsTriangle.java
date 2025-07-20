package com.vcb.leet.code.arrays;

import java.util.ArrayList;
import java.util.List;
/*
    Given an integer numRows, return the first numRows of Pascal's triangle.
    In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

    Input: numRows = 5
    Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 */
public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> currentRow = new ArrayList<>();
            for (int col = 0; col <= row; col++) {
                if (col == 0 || col == row) {
                    currentRow.add(1); // First and last elements are always 1
                } else {
                    int value = triangle.get(row - 1).get(col - 1) + triangle.get(row - 1).get(col);
                    currentRow.add(value);
                }
            }
            triangle.add(currentRow);
        }

        return triangle;
    }
}
