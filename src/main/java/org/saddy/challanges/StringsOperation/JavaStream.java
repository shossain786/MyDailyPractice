package org.saddy.challanges.StringsOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
//        numbers.stream().map(n -> n * n).forEach(System.out::println);
//        Collect Operation: Converts stream to a collection
        List<String> names = Arrays.asList("Anand", "Manish", "Ashraf", "Saddam", "Hossain", "Peter");
//        List<String> result = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
//        System.out.println(result); //output is [Anand, Ashraf]
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);
        String longestString = names.stream().reduce("", (s1,s2) -> s1.length() >= s2.length() ? s1:s2);
        System.out.println(longestString);
    }


}
