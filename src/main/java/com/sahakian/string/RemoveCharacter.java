package com.sahakian.string;

import java.util.stream.Collectors;

public class RemoveCharacter {
    public static void main(String[] args) {
        String word = "Hello";
        char symbol = 'l';
        System.out.println(removeCharacter1(word, symbol));
        System.out.println(removeCharacter2(word, symbol));
        System.out.println(removeCharacter3(word, symbol));
    }

    private static String removeCharacter1(String word,char symbol){
        StringBuilder result = new StringBuilder();

        for (int i = 0,length = word.length(); i <length ; i++) {
            char wordSymbol = word.charAt(i);
            if (wordSymbol == symbol){
                continue;
            }
            result.append(wordSymbol);
        }
        return result.toString();
    }

    private static String removeCharacter2(String word,char symbol){
       return word.replace(""+symbol,"");
    }

    private static String removeCharacter3(String word,char symbol){
        return word
                .chars()
                .filter(value -> (char)value !=symbol )
                .mapToObj(value -> String.valueOf((char) value))
                .collect(Collectors.joining());
    }
}
