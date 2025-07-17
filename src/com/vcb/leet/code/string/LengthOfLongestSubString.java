package com.vcb.leet.code.string;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubString {
    public static void main(String[] args) {
        String str = "abcabccbb";

        System.out.println(lengthOfLongestSubString(str));
    }

    private static int lengthOfLongestSubString(String str) {
        int ans = 0;
        int left = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < str.length(); right++) {
            char c = str.charAt(right);
            if (!map.containsKey(c)){
                map.put(c, right);
            } else {
                left = Math.max(c,map.get(c) + 1);
                map.put(c, right);
            }
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
} // TC: O(n) SC: O(n)
