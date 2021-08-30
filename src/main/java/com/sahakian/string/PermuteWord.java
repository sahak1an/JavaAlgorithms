package com.sahakian.string;

public class PermuteWord {
    public static void main(String[] args) {
        var word = "abc";
        permute(word);
    }

    private static void permute(String word){
        permute("",word);
    }

    private static void permute(String prefix,String word){
        int length = word.length();

        if (length==0){
            System.out.println(prefix);
        }else {
            for (int i = 0; i < length; i++) {
                prefix = prefix + word.charAt(i);
                word = word.substring(i+1,length)+ word.substring(0,i);
                permute(prefix,word);
            }
        }
    }
}
