package br.com.luizgmelo.challenges;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {
    public static void main(String[] args) {
        String original = "  double  spaced  words  ";
        System.out.println(reverseWords(original));
    }

    public static String reverseWords(final String original) {
        String[] words = original.split("\\s", -1);

        return Arrays.stream(words)
                .map(ReverseWords::reverseOneWord)
                .collect(Collectors.joining(" "));
    }

    private static String reverseOneWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
