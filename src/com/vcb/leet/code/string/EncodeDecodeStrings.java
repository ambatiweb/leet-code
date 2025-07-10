package com.vcb.leet.code.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeDecodeStrings {
    public static void main(String[] args) {
        String[] str = {"lint","code","love","you"};
        System.out.println(encode(Arrays.asList(str)));
        System.out.println(decode(encode(Arrays.asList(str))));
    }

    private static String encode(List<String> str){
        String encoded = "";
        for (String s: str){
            encoded = encoded + s.length()+"#"+s;
        }
        return encoded;
    }// TC: O(n), SC: O(n)

    public static List<String> decode(String str){
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()){
            int j = i;
            while (str.charAt(j) != '#' ) j++;
            int len = Integer.parseInt(str, i, j, 10);
            list.add(str.substring(j+1, j+len + 1));
            i = j + len + 1;
        }
        return list;
    }
    //TC: O(n), SC: O(n)
}
