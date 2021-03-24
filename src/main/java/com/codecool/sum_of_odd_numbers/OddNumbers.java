package com.codecool.sum_of_odd_numbers;

import java.util.List;

public class OddNumbers {

    public static Integer sum(List<Integer> numbers) {
        Integer sum = 0;
        for (Integer number : numbers) {
            if (number % 2 == 1 && number > 0) {
                sum += number;
            } else if (number % 2 == -1 && number < 0) {
                sum += number;
            }
        }
        return sum;
    }
}