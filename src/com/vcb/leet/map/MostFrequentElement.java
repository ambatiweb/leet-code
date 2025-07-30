package com.vcb.leet.map;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,2,4,5};

        System.out.println(mostFrequentElement(array));
    }

    private static int mostFrequentElement(int[] array) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : array){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        int maxCount = 0;
        int maxFrequentElement = array[0];

        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            if (entry.getValue() > maxCount){
                maxCount = entry.getValue();;
                maxFrequentElement = entry.getKey();
            }
        }

        return maxFrequentElement;
    }
}
