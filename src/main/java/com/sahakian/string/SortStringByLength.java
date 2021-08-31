package com.sahakian.string;

import java.util.Arrays;

public class SortStringByLength {
    public static void main(String[] args) {
        String[] arr = {"A", "a", "b", "a", "v"};
        String[] sorted = sorted1(arr);
        System.out.println(Arrays.toString(sorted));
    }

    private static String[] sorted1(String[] arr) {
        Arrays.sort(arr, String::compareTo);
        return arr;
    }


    private static String[] sorted2(String[] arr) {
        return Arrays
                .stream(arr)
                .sorted(String::compareTo)
                .toArray(String[]::new);
    }
}
