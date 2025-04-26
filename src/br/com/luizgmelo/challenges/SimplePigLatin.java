package br.com.luizgmelo.challenges;

import java.util.Arrays;

/*
    CHALLENGE
    Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.

    Examples
    pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
    pigIt('Hello world !');     // elloHay orldway !
 */
public class SimplePigLatin {
    public static void main(String[] args) {
        String ans = PigLatin.pigIt("Pig latin is cool");
        String ans2 = PigLatin.pigIt("Hello world !");
        System.out.println(ans);
        System.out.println(ans2);
    }
}

class PigLatin {
    public static String pigIt(String str) {
        StringBuilder answer = new StringBuilder();
        String[] words = str.split(" ");

        for (String word : words) {
            char lastChar = word.charAt(word.length() - 1);
            if (lastChar == '.' || lastChar == '!' || lastChar == '?' || lastChar == ',' || lastChar == ';' || lastChar == ':') {
                answer.append(word);
            } else {
                answer.append(word.substring(1)).append(word.charAt(0)).append("ay");
            }

            answer.append(" ");
        }

        return answer.toString().trim();
    }
}