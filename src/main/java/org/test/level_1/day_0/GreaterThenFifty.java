package org.test.level_1.day_0;
import java.util.*;

class GreaterThenFifty{

    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(10, 55, 60, 25, 80, 45);

        List<Integer> res = numbers.stream()
                .filter(n -> n>50)
                .toList();


        System.out.println("Numbs grter thn 50 are:	" +res);
    }
}
