package com.vcb.leet.algos;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/*
Given two words (start and end), and a dictionary, find the length of shortest transformation
sequence from start to end, such that only one letter can be changed at a time
and each intermediate word must exist in the dictionary.
Example: start = "hit"
         end = "cog"
         dict = ["hot","dot","dog","lot","log"]
 */
class WordNode {
    String word;
    int numSteps;

    public WordNode(String word, int numSteps){
        this.word = word;
        this.numSteps = numSteps;
    }
}
public class WordLadder {
    public static void main(String[] args) {
        String start = "hit";
        String end = "cog";
        Set<String> dict = new HashSet<>();
        //
        dict.add("hot");
        dict.add("dot");
        dict.add("dog");
        dict.add("lot");
        dict.add("log");


        System.out.println(ladderLength(start, end, dict));
    }

    private static int ladderLength(String beginWord, String endWord, Set<String> wordDict) {

        LinkedList<WordNode> queue = new LinkedList<>();
        queue.add(new WordNode(beginWord, 1));

        wordDict.add(endWord);

        while (!queue.isEmpty()){
            WordNode top = queue.remove();
            String word = top.word;

            if (word.equals(endWord)){
                return top.numSteps;
            }

            char[] arr = word.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                for (char c = 'a'; c <= 'z' ; c++) {
                    char tmp = arr[i];
                    if (arr[i]!=c){
                        arr[i] = c;
                    }

                    String newWord = new String(arr);
                    if (wordDict.contains(newWord)){
                        queue.add(new WordNode(newWord, top.numSteps+1));
                        wordDict.remove(newWord);
                    }
                    arr[i]=tmp;
                }
            }
        }

        return 0;
    }
}
