package org.test.level_1.day_1;

import java.util.*;

class FindDup{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(
                1,1,2,3,4,5,6,7,8,9,10,8,7,3,4);

        Set<Integer> nmbr = new HashSet<>();

        List<Integer> n1 = numbers
                .stream()
                .filter(n -> !nmbr.add(n)) //n1.add(n))==false
                .toList();

        System.out.println("Duplicate entries are :"+n1);

    }
}