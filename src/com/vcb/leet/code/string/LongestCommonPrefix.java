package com.vcb.leet.code.string;

/** Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return empty string.
 * Example 1:
 *  ["flower","flow","flight"] - fl is the common prefix
 * Example 2:
 *  ["abcd","accd","adcd"] - a i the common prefix
 * Example 3:
 *  ["dog","racecar","car"] - "" empty string is the common prefix
 * Example 4:
 * ["leetcode","lead","leet"] = le is the common prefix
 */

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }

    private static String longestCommonPrefix(String[] str) {
        if (str.length == 0) return "";
        String prefix = str[0];
        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
