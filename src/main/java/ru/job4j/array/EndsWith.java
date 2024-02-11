package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        for (int i = 0; i < postfix.length; i++) {
            if (word[word.length - i - 1] != postfix[postfix.length - 1 - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
