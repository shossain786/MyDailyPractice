package org.saddy.challanges.arrays;
/*
Print common elements between two array
*/

import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        String[] array1 = {"33", "43", "23", "2", "08"};
        String[] array2 = {"33", "3", "23"};
        printCommonElements(array1, array2);
    }
    static void printCommonElements(String[] array1, String[] array2) {
        Set<String> hashSet = new HashSet<>(Arrays.asList(array1));
        List<String> result = new ArrayList<>();

        for (String element : hashSet) {
            for (String ele : array2) {
                if (element.equals(ele))
                    result.add(element);
            }
        }
        System.out.println(result);
    }
}
