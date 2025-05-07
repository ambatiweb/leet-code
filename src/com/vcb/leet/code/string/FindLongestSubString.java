package com.vcb.leet.code.string;

import java.util.HashSet;

public class FindLongestSubString {
    public static void main(String[] args) {
        String str = "ABCABCABB";
        String str2 = "ccccc";
        String str3 = "pckkcmonpc";

        System.out.println(findLongestSubString(str));
    }

    private static String findLongestSubString(String str) {
        String longestOverAll = "";
        String longestTillNow = "";

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (set.contains(c)){
                longestTillNow = "";
                set.clear();
            }

            longestTillNow += c;

            set.add(c);

            if (longestTillNow.length() > longestOverAll.length()){
                longestOverAll = longestTillNow;
            }
        }

        return longestOverAll;

    }
}
