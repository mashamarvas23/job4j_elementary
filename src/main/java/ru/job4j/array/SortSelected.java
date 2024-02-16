package ru.job4j.array;

import ru.job4j.loop.SwitchArray;

public class SortSelected {
    public static int[] sort(int[] data) {
        int[] result = new int[data.length];
        for (int i = 0; i <= data.length - 1; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, min, i, data.length - 1);
            result = SwitchArray.swap(data, index, i);
        }
        return result;
    }
}
