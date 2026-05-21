package org.test.level_1.day_1;
import java.util.*;
import java.util.stream.Collectors;

class Square
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5,8,0,3,2,3,5,6,7,10);

        List<Integer> results = numbers
                .stream()
                .filter(n -> n>=2)
                .map(n -> n*n)
                //.collect(Collectors.toList()); : can be used but below method introduced in java 16 ->
                .collect(Collectors.toList());

        System.out.println(" new list: "+ results);
    }

}