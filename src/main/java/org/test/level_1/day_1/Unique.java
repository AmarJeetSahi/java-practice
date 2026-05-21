package org.test.level_1.day_1;

import java.util.*;

class Unique
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5,8,0,3,2,3,5,6,7,10,9,9);

        List<Integer> res = numbers.stream()
                .distinct()
                .toList();

        List<Integer> res2 = res
                             .stream()
                             .sorted()
                             .toList();

        System.out.println("New List : "+res);
        System.out.println("sorted unique list : "+ res2);
    }

}