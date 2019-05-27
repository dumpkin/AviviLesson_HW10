//клас для слова з перевіркою на паліндром з парною й не парною кількісттю літер

package com.dumpkin.avivi;

public class Word {
    private int lenght;
    private String text;

    public boolean ifPalindrome() {
        //перевірка на паліндром з виводом кількості літер в слові
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

        //якщо слово парне
        if (lenght % 2 == 0 && (lenght >3)) {
            for (int a = 0, b = lenght - 1; a < (lenght / 2); a++, b--) {

                if (text.charAt(a) != text.charAt(b)) {
                    error++;
                }

            }
        }
        //якщо слово не парне

        if (lenght % 2 != 0 && (lenght >= 3)) {
            for (int a = 0, b = lenght - 1; a < ((lenght-1) / 2); a++, b--) {

                if (text.charAt(a) != text.charAt(b)) {
                    error++;
                }

            }
        }
// ця перевірка зайва. можна в іфи впихнути

        if (error == 0) {
            return true;
        } else return false;
    }


}
