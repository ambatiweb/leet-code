package com.vcb.leet.code.arrays;
/*
    You are given an array prices where prices[i] is the price of a given stock on the ith day.
    You want to maximize your profit by choosing a single day to buy one stock and choosing a different
    day in the future to sell that stock.
    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

    Input: prices = [7,1,5,3,6,4]
    Output: 5
    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
    Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 */
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        System.out.println(maxProfits(prices));
    }

    private static int maxProfits(int[] prices) {
        int profit = 0;
        int left = 0;

        for (int right = 0; right < prices.length; right++) {
            if (prices[left] < prices[right]){
                profit = Math.max(profit, prices[right] - prices[left]);
            } else {
                left = right;
            }
        }
        return profit;
    }
}
