// homework 10

// Написати програму, яка знайде максимальний по довжині паліндром в підстрічці.

package com.dumpkin.avivi;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String Str = "Алла ставила шалаш поки дід Пилип яму вирив";
        Word checkWord = new Word();
        String biggestPalindrome = "";

        System.out.println(Str + "\n");

        for (String retval : Str.split(" ")) {
            checkWord.setText(retval.toLowerCase());
            //perevirka na palindrome
            if (checkWord.ifPalindrome()) {
                if (biggestPalindrome.length() < checkWord.getLenght()) {
                    biggestPalindrome = checkWord.getText();
                }
            }

            // druk slova dla testa

            //System.out.println(retval + " " + " довжина " + checkWord.getLenght());

        }
        System.out.println("________________________________________________");
        System.out.println("найыльше слово палындром: " + biggestPalindrome);
    }
}
