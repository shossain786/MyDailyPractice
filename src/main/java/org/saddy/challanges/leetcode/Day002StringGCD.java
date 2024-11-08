package org.saddy.challanges.leetcode;
/*
* Greatest Common Divisor of Strings
* For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t
* (i.e., t is concatenated with itself one or more times).
* Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
*
* Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""
* */
public class Day002StringGCD{
    public static void gcdOfStrings(String str1, String str2) {
        if (!(str1+str2).equals(str2+str1))
            System.out.println("No GCD.");

        int gcdLength = gcdLength(str1.length(), str2.length());

        System.out.println(str1.substring(0, gcdLength));
    }

    static int gcdLength(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
    public static void main(String[] args) {
        gcdOfStrings("ABCABC", "ABC");
        gcdOfStrings("ABABAB", "ABAB");
        gcdOfStrings("LEET", "CODE");
    }
}
