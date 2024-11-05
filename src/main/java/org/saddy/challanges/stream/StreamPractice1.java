package org.saddy.challanges.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamPractice1 {
    public static void main(String[] args) {
        basicFilter();
    }


//    filter out even numbers, then multiply each remaining number by 2.
    static void basicFilter() {
        List<Integer> numbers = Arrays.asList(10, 23, 34, 45, 12, 3);
        List<Integer> newNums = numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n *2)
                .collect(Collectors.toList());

        System.out.println(newNums);

//        finding max, min
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        max.ifPresent(System.out::println);
        min.ifPresent(System.out::println);
    }
}
