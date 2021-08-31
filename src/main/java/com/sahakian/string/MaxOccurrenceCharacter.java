package com.sahakian.string;

import java.util.*;

public class MaxOccurrenceCharacter {
    public static void main(String[] args) {
        String word = "Hello world";
        maxOccurrenceCharacter(word);
    }

    private static void maxOccurrenceCharacter(String word) {
        Map<Character, Integer> map = occurrenceCharacter(word);
        Map.Entry<Character, Integer> max = map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(max.getKey() + "   ->   "+ max.getValue());
    }


    private static Map<Character, Integer> occurrenceCharacter(String word) {
        final Map<Character, Integer> characters = new HashMap<>();

        for (int i = 0, length = word.length(); i < length; i++) {
            characters.compute(word.charAt(i), (key, value) -> value == null ? 1 : ++value);
        }
        return characters;
    }
}
