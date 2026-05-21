package org.test.level_1.day_1;

import java.util.*;

class FindDup{
    public static void main(String[] args)
    {
        List<String> words = Arrays.asList(
                "apple", "banana", "orange", "apple", "grape",
                "banana", "kiwi", "apple", "mango", "orange");

        Set<String> sts = new HashSet<>();

        List<String> fruits = words
                .stream()
                .filter(str -> !sts.add(str)) //sts.add(str))==false
                .toList();

        System.out.println("Duplicate entries are :"+fruits);

    }
}