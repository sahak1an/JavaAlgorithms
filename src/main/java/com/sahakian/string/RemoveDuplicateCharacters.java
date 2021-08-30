package com.sahakian.string;

import java.util.stream.Collectors;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {

        String word = "Hello";
        System.out.println(removeDuplicateCharacters(word));
    }

    private static String removeDuplicateCharacters(String word) {
        return word
                .chars()
                .distinct()
                .mapToObj(operand -> "" + (char) operand)
                .collect(Collectors.joining());
    }
}
