package org.saddy.challanges.arrays;
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input has exactly one solution, and you may not use the same element twice

Input: nums = [2, 7, 11, 15], target = 9
Output: [0, 1]
Explanation: nums[0] + nums[1] = 2 + 7 = 9
*/

import java.util.HashMap;

public class ArrayNumsSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 6, 1, 0, 3, 15};
        int target = 9;
        printIndices(nums, target);
        printIndices1(nums, target);
    }
// nested for loop
    static void printIndices(int[] numArray, int target) {
        for (int i = 0; i< numArray.length; i++) {
            for (int j = i+1; j <numArray.length; j++)
                if (numArray[i] + numArray[j] == target)
                    System.out.println("Output: ["+ i +"," + j +"]");
        }
    }

//    avoiding nested loops. More recommended way of programming
    static void printIndices1(int[] numArray, int target){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i< numArray.length; i++) {
            int complement = target - numArray[i];
            if (hashMap.containsKey(complement)) {
                System.out.println("Output: [" + complement + "," + numArray[i] + "]");
            }
            hashMap.put(numArray[i], i);
        }
    }
}
