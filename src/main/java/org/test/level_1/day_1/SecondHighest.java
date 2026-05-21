package org.test.level_1.day_1;
import  java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 11, 23, 11, 8, 35, 23, 35, 14,18);

        int result = numbers
                .stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(-1);

        System.out.println(" 2nd highest number is : "+ result);

    }
}