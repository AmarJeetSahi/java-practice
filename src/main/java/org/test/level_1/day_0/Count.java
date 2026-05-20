package org.test.level_1.day_0;
import java.util.*;

class Count{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        long count = numbers.stream().count();

        System.out.println("Total numbers are: " + count);
    }
}