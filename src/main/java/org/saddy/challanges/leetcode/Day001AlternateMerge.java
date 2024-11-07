package org.saddy.challanges.leetcode;
/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
starting with word1. If a string is longer than the other, append the additional letters onto the
 end of the merged string. Write in code in java
*/

public class Day001AlternateMerge {

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));  //output: apbqcr
        System.out.println(mergeAlternately("ab", "pqrs"));  //output: apbqrs
        System.out.println(mergeAlternately("abcd", "pq"));  //output: apbqcd
    }

    static String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;

        // Loop through both strings
        while (i < word1.length() && j < word2.length()) {
            merged.append(word1.charAt(i++));
            merged.append(word2.charAt(j++));
        }

        // Append remaining characters from word1, if any
        while (i < word1.length()) {
            merged.append(word1.charAt(i++));
        }

        // Append remaining characters from word2, if any
        while (j < word2.length()) {
            merged.append(word2.charAt(j++));
        }

        return merged.toString();
    }
}
