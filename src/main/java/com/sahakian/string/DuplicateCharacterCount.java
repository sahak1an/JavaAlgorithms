package com.sahakian.string;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharacterCount {
    public static void main(String[] args) {
        String word = "aabacb";
        var duplicateCount1 = duplicateCount1(word);
        var duplicateCount2 = duplicateCount2(word);
        System.out.println(duplicateCount1);
        System.out.println(duplicateCount2);
    }

    private static Map<Character, Integer> duplicateCount1(String word) {
        final Map<Character, Integer> helper = new HashMap<>();

        for (int i = 0, length = word.length(); i < length; i++) {
            char symbol = word.charAt(i);
            helper.compute(symbol, (key, value) -> value == null ? 1 : ++value);
        }
        return helper;
    }

    private static Map<Character, Long> duplicateCount2(String word) {
        return word
                .chars()
                .mapToObj(value -> (char) value)
                .collect(Collectors.groupingBy(character -> character, Collectors.counting()));
    }
}
