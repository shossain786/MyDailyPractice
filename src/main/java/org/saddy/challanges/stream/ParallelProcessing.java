package org.saddy.challanges.stream;

import java.util.stream.IntStream;
//Process a large dataset in parallel to find all prime numbers
public class ParallelProcessing {
    public static void main(String[] args) {
        IntStream.rangeClosed(2, 30)
                .parallel()
                .filter(ParallelProcessing::isPrime)
                .forEach(System.out::println);
    }

    static boolean isPrime(int num) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(num))
                .noneMatch(divisor -> num % divisor == 0);
    }
}
