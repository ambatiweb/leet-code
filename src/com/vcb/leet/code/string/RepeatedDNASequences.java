package com.vcb.leet.code.string;

import java.util.*;

/**
 * All DNA is composed of a series of nucleotides abbreviated as 'A', 'C', 'G' and 'T' for example: "ACGAATTCCG".
 * when studying DNA, it is sometimes useful to identify repeated sequences within the DNA.
 * Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.
 *
 * Example 1:
 * Input: s = "AAAAACCCCCAAAAACCCCCAAAAAGGGTT"
 * Output: ["AAAAACCCCC","CCCCCAAAAA"]
 *
 * Example 2:
 * Input: s = "AAAAAAAAAA"
 * Output: ["AAAAAAAAAA"]
 */
public class RepeatedDNASequences {

    public static void main(String[] args) {
         String str = "AAAAAAAAAAA";
         List<String> result = findRepeatedDnaSequenceHM(str);
         result.forEach(System.out::println);

        Set<String> set = findRepeatedDnaSequenceS(str);

        set.forEach(System.out::println);

    }

    private static Set<String> findRepeatedDnaSequenceS(String str) {
        Set<String> set = new HashSet<>();
        Set<String> list = new HashSet<>();
        for (int i = 0; i <= str.length() - 10; i++) {
            String subStr = str.substring(i, i+10);
            if (set.contains(subStr)){
                list.add(subStr);
            } else {
                set.add(subStr);
            }
        }

        return list;
    }

    private static List<String> findRepeatedDnaSequenceHM(String str) {

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i <= str.length() - 10; i++) {
            String subStr = str.substring(i, i + 10);
            map.put(subStr, map.getOrDefault(subStr, 0) + 1);
        }

        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> item : map.entrySet()){
            if (item.getValue() > 1){
                list.add(item.getKey());
            }
        }

        return list;
    }

}
