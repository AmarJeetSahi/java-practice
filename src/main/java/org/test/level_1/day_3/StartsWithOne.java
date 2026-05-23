package org.test.level_1.day_3;
import java.util.*;

class StartsWithOne{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(5, 13, 4, 21, 13, 27, 21, 59, 5,111,34,12,19);

        List<Integer> res = numbers
                .stream()
                .filter(n -> String.valueOf(n).startsWith("1"))
                .toList();

        System.out.println(" numbers are :" +res);
    }
}