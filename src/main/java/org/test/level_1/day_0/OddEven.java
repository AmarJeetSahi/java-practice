package org.test.level_1.day_0;
import java.util.*;


public class OddEven {
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 1, 6);

        List<Integer> oddResults = numbers
                .stream()
                .filter(n -> n % 2 !=0)
                .toList();

        List<Integer> evenResults = numbers
                .stream()
                .filter(n -> n %2 ==0)
                .toList();

        System.out.println("OddNumbers are: " + oddResults);
        System.out.println("OddNumbers are: " + evenResults);
    }
}