package org.test.level_1.day_3;
import java.util.*;

class MaxMin{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(5, 13, 4, 21, 13, 27, 21, 59, 5);

        Integer max = numbers
                .stream()
                .sorted()
                .max(Integer::compareTo)
                .get();


        Integer min = numbers
                .stream()
                .sorted()
                .min(Integer::compareTo)
                .get();

        System.out.println("Max no is: "+max+" Min no is: "+min);
    }
}