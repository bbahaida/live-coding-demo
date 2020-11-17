package com.bbahaida.codewars;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int key = target - numbers[i];
            if (map.containsKey(key)) {
                return new int[]{i, map.get(key)};
            }
            map.put(numbers[i], i);
        }
        throw new RuntimeException("You lied to me");
    }
}
