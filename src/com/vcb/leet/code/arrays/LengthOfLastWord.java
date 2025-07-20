package com.vcb.leet.code.arrays;
/*
    Given a string s consisting of words and spaces, return the length of the last word in the string.
    A word is a maximal substring consisting of non-space characters only.

    Input: s = "Hello World"
    Output: 5
    Explanation: The last word is "World" with length 5
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s)); // Output: 5
    }

    public static int lengthOfLastWord(String s) {
        int count = 0;
        // We are looking for the last word so let's go backward
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') { // a letter is found so count
                count++;
            } else {  // it's a white space instead
                //  Did we already started to count a word ? Yes so we found the last word
                if (count > 0) return count;
            }
        }
        return count;
    }
}
