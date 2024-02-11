package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] prefix) {
        boolean result = true;
        for (int i = 0; i <= prefix.length - 1; i++) {
            if (word[i] != prefix[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
