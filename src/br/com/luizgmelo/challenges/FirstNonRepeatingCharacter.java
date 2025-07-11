package br.com.luizgmelo.challenges;

/* CHALLENGE

Write a function named first_non_repeating_letter† that takes a string input, and returns the first character that is not repeated anywhere in the string.

For example, if given the input 'stress', the function should return 't', since the letter t only occurs once in the string, and occurs first in the string.

As an added challenge, upper- and lowercase letters are considered the same character, but the function should return the correct case for the initial letter. For example, the input 'sTreSS' should return 'T'.

If a string contains all repeating characters, it should return an empty string ("");

† Note: the function is called firstNonRepeatingLetter for historical reasons, but your function should handle any Unicode character.

*/


import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String stress = Kata.firstNonRepeatingLetter("stress");
        String sTreSS = Kata.firstNonRepeatingLetter("sTreSS");
        System.out.println(stress);
        System.out.println(sTreSS);
    }
}

class Kata {
    public static String firstNonRepeatingLetter(String s){
        Map<Character, Integer> counter = new HashMap<>();

        for (char c : s.toLowerCase().toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (counter.get(c) == 1) {
                return String.valueOf(s.charAt(i));
            }
        }

        return "";
    }
}