package com.dumpkin.avivi;

public class Word {
    private int lenght;
    private String text;

    public boolean ifPalindrome() {
        //check word first and last chars
        if (wordCheck()){
            System.out.println("palindrome word: "+text+" ");
            return true;
        }

        return false;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLenght() {
        return lenght;
    }

    public String getText() {
        return text;
    }

    private boolean wordCheck() {
        //get word length
        lenght = text.length();
        int error = 0;
        if (lenght % 2 == 0 && (lenght >3)) {
            for (int a = 0, b = lenght - 1; a < (lenght / 2); a++, b--) {

                if (text.charAt(a) != text.charAt(b)) {
                    error++;
                }

            }
        }
        if (lenght % 2 != 0 && (lenght >= 3)) {
            for (int a = 0, b = lenght - 1; a < ((lenght-1) / 2); a++, b--) {

                if (text.charAt(a) != text.charAt(b)) {
                    error++;
                }

            }
        }

        if (error == 0) {
            return true;
        } else return false;
    }


}
