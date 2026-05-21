
package org.test.level_1.day_0;

import java.util.Arrays;
import java.util.List;

public class IncreaseByOne {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 5, 12, 8, 15);
        List<Integer> nums= List.of(10, 20, 30, 40, 50, 5, 12, 8, 15);
        int[] arr = {10, 20, 30, 40, 50, 5, 12, 8, 15};

        Arrays.stream(arr);



        List<Integer> result = numbers.stream().map(n -> (n+1)).toList();

        System.out.println("New List : "+result);
    }
}
